package juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    private int ticket = 100;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try{
                if(ticket>0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                    }
                    ticket--;
                    System.out.println("当前窗口" + Thread.currentThread().getName() + "|" + "剩下的余票为===" + ticket);
                }

            }finally {
                lock.unlock();
            }


        }

    }
}
