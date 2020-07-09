package Juc03;

public class ProducerConsumerWithLockDemo { public static void main(String[] args) {
    ProductFactoryWithLock productFactory = new ProductFactoryWithLock(100);
    new Thread(new ConsumerWithLock(productFactory), "1号消费者").start();
    new Thread(new ProducerWithLock(productFactory), "1号生产者").start();
    //new Thread(new ProducerWithLock(productFactory), "2号生产者").start();
    new Thread(new ConsumerWithLock(productFactory), "2号消费者").start();
    new Thread(new ConsumerWithLock(productFactory), "3号消费者").start();
    new Thread(new ConsumerWithLock(productFactory), "4号消费者").start();
    new Thread(new ConsumerWithLock(productFactory), "5号消费者").start();
}
}
