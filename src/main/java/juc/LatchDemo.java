package juc;

import java.util.concurrent.CountDownLatch;

public class LatchDemo implements Runnable{
    private CountDownLatch latch;
    public LatchDemo(CountDownLatch latch){
        this.latch =latch;
    }

    @Override
    public void run() {
        synchronized (this){
            for(int i=0;i<500000;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
            latch.countDown();
        }
    }
}
