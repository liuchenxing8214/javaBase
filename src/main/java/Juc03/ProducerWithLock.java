package Juc03;

// 生产者
class ProducerWithLock implements Runnable {
    private ProductFactoryWithLock productFactory;
    public ProducerWithLock(ProductFactoryWithLock productFactory) {
        this.productFactory = productFactory;
    }
    public void run() {
        int i = 0;
        while (true) {
            productFactory.produce(String.valueOf(i));
            i++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
