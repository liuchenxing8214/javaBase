package juc2;

// VegetableBase.java

// 蔬菜基地
public class VegetableBase implements Runnable {

    // 超市实例
    private Supermarket supermarket = null;

    public VegetableBase(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sleep();
                supermarket.push("黄瓜", 1300);
                System.out.println("push : 黄瓜 " + 1300);
            } else {
                sleep();
                supermarket.push("青菜", 1400);
                System.out.println("push : 青菜 " + 1400);
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}