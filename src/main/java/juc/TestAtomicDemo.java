package juc;

public class TestAtomicDemo {
    public static void main(String[] args) {
        AtomicDemo task =new AtomicDemo();
        for(int i=0;i<10;i++){
            new Thread(task).start();
        }
    }
}
