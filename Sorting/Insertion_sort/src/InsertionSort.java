import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 9, 1, 3, -8, 55, 0, 90};
        insertion_sort(arr);

    }

    static void insertion_sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current <arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
