package Juc05;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class MyCache {
    private volatile Map<String,Object> map = new HashMap<>();

    /**
     * 多个线程同时读一个资源类没有任何问题，所以为了满足并发量，读取共享资源应该可以同时进行。
     * 但是
     * 如果有一个线程象取写共享资源来，就不应该自由其他线程可以对资源进行读或写
     * 总结
     * 读读能共存
     * 读写不能共存
     * 写写不能共存
     */
     private ReadWriteLock lock =new ReentrantReadWriteLock();


    public void put(String key,Object value){
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"开始写入数据"+"\t"+"key=="+key+"|"+"value=="+value);
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+"写入数据完成");
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void get(String key){
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"===开始读数据"+"key=="+key);
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName()+"===读数据完成"+"|result=="+result);
        } finally {
            lock.readLock().unlock();
        }
    }

}
