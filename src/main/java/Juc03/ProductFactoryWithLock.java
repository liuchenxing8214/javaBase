package Juc03;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.*;

class ProductFactoryWithLock {
    private List<String> products;
    private int capacity = 0;
    private Lock lock = new ReentrantLock();
    private Condition canProduce = lock.newCondition();
    private Condition canConsume = lock.newCondition();

    //初始化产品最大容量
    public ProductFactoryWithLock(int capacity) {
        this.capacity = capacity;
        products = new LinkedList<>();
    }

    // 生产产品
    public void produce(String product) {
        lock.lock();
        try {
            while (capacity == products.size()) {
                //打日志的目的是更好的观察消费者和生产者状态
                System.out.println("警告：线程(" + Thread.currentThread().getName() + ")准备生产产品，但产品池已满");
                try {
                    canProduce.await();
                } catch (InterruptedException e) {
                }
            }
            products.add(product);
            System.out.println("线程(" + Thread.currentThread().getName() + ")生产了一件产品:" + product + ";当前剩余商品" + products.size() + "个");
            canConsume.signal();
        } finally {
            lock.unlock();
        }
    }

    // 消费产品
    public  String consume() {
        lock.lock();
        try {
            while (products.size() == 0) {
                try {
                    //打日志的目的是更好的观察消费者和生产者状态
                    System.out.println("警告：线程(" + Thread.currentThread().getName() + ")准备消费产品，但当前没有产品");
                    canConsume.await();
                } catch (InterruptedException e) {
                }
            }
            String product = products.remove(0);
            System.out.println("线程(" + Thread.currentThread().getName() + ")消费了一件产品:" + product + ";当前剩余商品" + products.size() + "个");
            canProduce.signal();
            return product;
        } finally {
            lock.unlock();
        }
    }
}

