import java.util.Arrays;

public class bubble_s {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1 ,89, 6, 7, 90, 4, 1, -4};
        bubbleSort(arr);

    }

    static void bubbleSort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }


    }
        System.out.println(Arrays.toString(arr));
}
}
