package JavaBase;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {12, 24, 34, 3, 6, 7, 8, 9, -2, 10, 123, 353, 46};  //数组的静态化
        System.out.println("冒泡排序前为"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("冒泡排序后为"+Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        //共比较arr.length-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //每轮比较arr.length-1-i次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
