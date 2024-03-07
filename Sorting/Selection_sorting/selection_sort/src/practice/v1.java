package practice;

import java.util.Arrays;

public class v1 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1 ,8, 9, 0, 4, -23};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0 ; i< n-1 ; i++){
            int min = i ;
            for (int j = i+1; j < n ; j++) {
                if(arr[min] > arr[j]){
                    min = j;

                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
