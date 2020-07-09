package Juc04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//店员
public class Clerk {
    private int product; //产品数

    private Lock lock =new ReentrantLock();
    private Condition condition = lock.newCondition();

    //进货
    public  void get() {
        lock.lock();
        try{
            while (product > 20) {
                System.out.println("产品已经满了");
                try {
                    condition.await();
                } catch (InterruptedException e) {

                }
            }
            product++;
            System.out.println(Thread.currentThread().getName() + ":" + product);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    //售货
    public  void sale() {
        lock.lock();
        try{
            while (product <= 0){
                System.out.println("缺货");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                }
            }
            product--;
            System.out.println(Thread.currentThread().getName() + ":" + product);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }


}
