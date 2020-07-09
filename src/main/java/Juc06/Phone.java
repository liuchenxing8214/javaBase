package Juc06;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Phone {
    public static synchronized void sendEmail() throws Exception{
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("------sendEmail");
    }

    public  synchronized void sendSMS() throws Exception{
        System.out.println("-----sendSMS");
    }

    public void hello(){
        System.out.println("----hello");
    }




}
