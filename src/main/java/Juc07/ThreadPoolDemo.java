package Juc07;

public class ThreadPoolDemo implements Runnable{
    private int num =0;


    @Override
    public void run() {
        while(num<=10000){
            System.out.println(Thread.currentThread().getName()+":"+num);
            num++;
        }
    }
}
