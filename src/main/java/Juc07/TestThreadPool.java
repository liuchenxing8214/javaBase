package Juc07;

import juc.ThreadDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


/***
 * 一、线程池：提供了一个线程队列，队列中保存着所有等待状态的线程。避免了创建与销毁额外开销，提高了响应的速度。
 *
 * 二、线程池的体系结构：
 * 	java.util.concurrent.Executor : 负责线程的使用与调度的根接口
 * 		|--**ExecutorService 子接口: 线程池的主要接口
 * 			|--ThreadPoolExecutor 线程池的实现类
 * 			|--ScheduledExecutorService 子接口：负责线程的调度
 * 				|--ScheduledThreadPoolExecutor ：继承 ThreadPoolExecutor， 实现 ScheduledExecutorService
 *
 * 三、工具类 : Executors
 * ExecutorService newFixedThreadPool() : 创建固定大小的线程池
 * ExecutorService newCachedThreadPool() : 缓存线程池，线程池的数量不固定，可以根据需求自动的更改数量。
 * ExecutorService newSingleThreadExecutor() : 创建单个线程池。线程池中只有一个线程
 *
 * ScheduledExecutorService newScheduledThreadPool() : 创建固定大小的线程，可以延迟或定时的执行任务。

**/
public class TestThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        /*ThreadPoolDemo task = new ThreadPoolDemo();
        for(int i=1;i<=100;i++){
            pool.submit(task);
        }*/
        List<Future<Integer>> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            Future<Integer> future = pool.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int total = 0;
                    for (int i = 1; i <= 100; i++) {
                        total = i + total;
                    }
                    return total;
                }
            });
            list.add(future);
        }
        for(Future<Integer> obj:list){
            System.out.println(obj.get());
        }
        pool.shutdown();
    }
}
