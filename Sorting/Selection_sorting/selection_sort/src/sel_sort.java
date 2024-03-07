import java.lang.reflect.Array;
import java.util.Arrays;

public class sel_sort {
    public static void main(String[] args) {
        int[] arr = {34, 12, 89, 2, 56, 3, 10, -78, 8, 5};
        selection_sort(arr);
    }
    static  void  selection_sort(int[] arr){
        int n = arr.length;
        for ( int i = 0 ; i< n-1 ; i++){
            int min = i ;
            for (int j = i+1; j <n ; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
