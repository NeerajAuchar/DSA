import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {34, 65, 2, 9, 4, 12, 83};
        bubbleSort(arr);

    }


    static void bubbleSort(int[] arr){
        //external loop
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println(Arrays.toString(arr));
    }
}
