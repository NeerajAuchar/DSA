import java.util.Arrays;

public class revision {
    public static void main(String[] args) {
        int [] arr = { 3, 7, 23, 8, 5, 12, 98, -9, 2, 1, 0, 34, 23, -2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void selection_sort(int arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
            int min = i ;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min] ){
                    min = j;
                }
            }

            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    
}
