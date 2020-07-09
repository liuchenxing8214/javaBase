package JavaBase;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(8==i){
                //当i==8时，退出一次循环
                continue;
            }
            System.out.println("i==="+i);
        }
    }
}
