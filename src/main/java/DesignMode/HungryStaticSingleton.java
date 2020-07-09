package DesignMode;

public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton =new HungryStaticSingleton();
    }
    public HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
