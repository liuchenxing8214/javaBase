package StaticBlock;
@Deprecated
public class HelloA {
    //构造函数
    public HelloA(){
        System.out.println("A的构造函数");
    }
    //构造代码块
    {
        System.out.println("A的构造代码块");
    }
    //静态代码块
    static {
        System.out.println("A的静态代码块");
    }

    public static void main(String[] args) {

    }


}
