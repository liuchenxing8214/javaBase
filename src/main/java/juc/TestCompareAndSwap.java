package juc;

public class TestCompareAndSwap {

    public static void main(String[] args) {
        final CompareAndSwap cas = new CompareAndSwap();
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int expectedValue = cas.getValue();
                    System.out.println("内存值为"+expectedValue);
                    int newValue = (int) (Math.random() * 101);
                    System.out.println("更新的值为"+newValue);
                    boolean b = cas.compareAndSet(expectedValue, newValue);
                    System.out.println(b);
                }
            }).start();
        }

    }
}
