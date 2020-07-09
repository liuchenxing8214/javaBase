package juc2;

// 超市
public class Supermarket {

    // 蔬菜名称
    private String name;
    // 蔬菜数量
    private Integer num;
    // 超市是否为空
    private Boolean isEmpty = true;

    // 蔬菜基地向超市输送蔬菜
    public synchronized void push(String name, Integer num) {
        try {
            // 超市有货时，不再输送蔬菜，而是要等待消费者获取
            while (!isEmpty) {
                this.wait();
            }
            this.name = name;
            this.num = num;
            isEmpty = false;
            this.notify(); 	// 唤醒另一个线程
        } catch(Exception e) {

        }

    }

    // 用户从超市中购买蔬菜
    public synchronized void popup() {

        try {
            // 超市无货时，不再提供消费，而是要等待蔬菜基地输送
            while (isEmpty) {
                this.wait();
            }
            // 为了让效果更明显，在这里模拟网络延迟
            Thread.sleep(1000);
            System.out.println("蔬菜：" + this.name + ", " + this.num + "颗。");
            isEmpty = true;
            this.notify();  // 唤醒另一线程
        } catch (Exception e) {

        }
    }
}
