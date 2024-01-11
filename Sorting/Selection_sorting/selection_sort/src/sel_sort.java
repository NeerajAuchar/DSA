import java.lang.reflect.Array;
import java.util.Arrays;

public class sel_sort {
    public static void main(String[] args) {
        int[] arr = {34, 12, 89, 2, 56, 3, 10, 8, 5};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection_sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {
            int min = i ;
            for (int j = i+1 ; j < n ; j++) {
                if(arr[j] < arr[min]){
                    min = j  ;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }

    }
}
