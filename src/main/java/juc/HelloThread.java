package juc;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class HelloThread implements Runnable{

//	private static List<String> list = Collections.synchronizedList(new ArrayList<String>());

    private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

    static{
        list.add("AA");
        list.add("BB");
        list.add("CC");
    }

    @Override
    public void run() {

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

            list.add("AA");
        }

    }

}