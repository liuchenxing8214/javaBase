package JavaBase;

public class ArrayDemo03 {
    public static void main(String[] args) {
        //求数组的最大，最小值
        int arr[] = {12, 24, 34, 3, 6, 7, 8, 9, -2, 10, 123, 353, 46};  //数组的静态化
        int max = 0;
        int min = 0;
        max = min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //arr[i]是主角
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max=====" + max);
        System.out.println("min=====" + min);
    }
}
