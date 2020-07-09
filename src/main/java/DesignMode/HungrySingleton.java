package DesignMode;

public class HungrySingleton {

    private static final HungrySingleton  hungrySingleton=new HungrySingleton();
    private HungrySingleton(){}
    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
