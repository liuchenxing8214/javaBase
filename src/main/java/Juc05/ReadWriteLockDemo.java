package Juc05;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCache myCache =new MyCache();
        for(int i=1;i<=5;i++){
            final int temp = i;
            new Thread(()->{myCache.put(temp+"",temp+"");},"Thread"+i).start();
        }
        for(int i=1;i<=5;i++){
            final int temp = i;
            new Thread(()->{myCache.get(temp+"");},"Thread"+i).start();
        }
    }
}
