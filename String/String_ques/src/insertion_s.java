import java.util.Arrays;

public class insertion_s {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1 ,89, 6, 7, 90, 4, 1, -4};
        insertionSort(arr);
    }

    static  void insertionSort(int[] arr){
        int n= arr.length;
        for (int i = 1; i < n ; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j>= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
