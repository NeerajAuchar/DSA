package practice;

import java.util.Arrays;

public class v1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 9, 1, 3, -8, 55, 0, 90};
        insetionS(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insetionS(int[] arr){
        int n= arr.length;
        for (int i = 1; i <n ; i++) {
            int current = arr[i];
            int j= i-1;
            while (j>=0 && current < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
    }
}
