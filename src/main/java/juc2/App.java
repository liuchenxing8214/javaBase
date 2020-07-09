package juc2;

public class App {public static void main(String[] args) {
    // 创建超市实例
    Supermarket supermarket = new Supermarket();
    // 蔬菜基地线程启动, 开始往超市输送蔬菜
    new Thread(new VegetableBase(supermarket)).start();
    // 消费者线程启动，消费者开始购买蔬菜
    new Thread(new Consumer(supermarket)).start();
    new Thread(new VegetableBase(supermarket)).start();
    new Thread(new Consumer(supermarket)).start();
}
}
