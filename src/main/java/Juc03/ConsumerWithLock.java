package Juc03;

// 消费者
class ConsumerWithLock implements Runnable {
    private ProductFactoryWithLock productFactory;
    public ConsumerWithLock(ProductFactoryWithLock productFactory) {
        this.productFactory = productFactory;
    }

    public void run() {
        while (true) {
            productFactory.consume();
            try {
                Thread.sleep(55);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
