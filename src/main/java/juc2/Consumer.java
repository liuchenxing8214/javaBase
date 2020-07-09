package juc2;

// 消费者
public class Consumer implements Runnable {

    // 超市实例
    private Supermarket supermarket = null;

    public Consumer(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            supermarket.popup();
        }
    }
}