package juc;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
    public static void main(String[] args) {
        final CountDownLatch latch =new CountDownLatch(2);
        LatchDemo demo = new LatchDemo(latch);
        long start = System.currentTimeMillis();
        for(int i=0;i<2;i++){
            new Thread(demo).start();;
        }
        try {
            latch.await();
        } catch (InterruptedException e) {

        }
        long end = System.currentTimeMillis();
        System.out.println("耗费时间为：" + (end - start));

    }
}
