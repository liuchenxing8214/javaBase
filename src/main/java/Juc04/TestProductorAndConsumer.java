package Juc04;


public class TestProductorAndConsumer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Consumer cus = new Consumer(clerk);
        Productor pro = new Productor(clerk);
        new Thread(pro,"生产者A").start();
        new Thread(cus,"消费者B").start();
        new Thread(pro,"生产者C").start();
        new Thread(cus,"消费者D").start();

    }
}
