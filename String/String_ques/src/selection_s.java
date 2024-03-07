import java.util.Arrays;

public class selection_s {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1 ,89, 6, 7, 90, 4, 1, -4};
        selectionSort(arr);

    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int mid = i;
            for (int j = i+1; j <n ; j++) {
                if (arr[mid] > arr[j]){
                    mid = j;
                }
                int temp = arr[i];
                arr[i] = arr[mid];
                arr[mid] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
