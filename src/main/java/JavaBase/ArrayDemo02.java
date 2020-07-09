package JavaBase;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int score[] = new int[10];
        for (int i = 0; i < 10; i++) {
            score[i] = i * 2 + 1;
        }
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }

    }
}
