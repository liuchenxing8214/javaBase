package Juc07;


import java.util.Random;
import java.util.concurrent.*;

public class TestSchedulledThreadPool {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        for(int i=0;i<10;i++){
            Future<Integer> future = pool.schedule(new Callable<Integer>() {

                @Override
                public Integer call() throws Exception {
                    int num = new Random().nextInt(100);
                    System.out.println(Thread.currentThread().getName()+":"+num);
                    return num;
                }
            },1, TimeUnit.MILLISECONDS);
            System.out.println("得到的随机数为"+future.get());
        }
    }
}
