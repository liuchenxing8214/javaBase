package StaticBlock;

public class HelloC {
    public HelloC(){//构造函数
        System.out.println("A的构造函数");
    }
    {//构造代码块
        System.out.println("A的构造代码块");
    }
    static {//静态代码块
        System.out.println("A的静态代码块");
    }
    public static void main(String[] args) {
        HelloC a=new HelloC();
        HelloC b=new HelloC();
    }

}