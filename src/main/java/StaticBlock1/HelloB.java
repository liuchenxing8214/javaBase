package StaticBlock1;

public class HelloB extends HelloA{
    public HelloB(){//构造函数
        System.out.println("B的构造函数");
    }
    {//构造代码块
        System.out.println("B的构造代码块");
    }
    static {//静态代码块
        System.out.println("B的静态代码块");
    }
    public static void main(String[] args) {
        HelloB b=new HelloB();
    }
}
