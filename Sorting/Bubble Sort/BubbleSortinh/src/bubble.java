import java.util.Arrays;

public class bubble {
    // Here we have to take the biggest element in the array to the end and like wise we have to sort the array.
    // the time complexity of the bubble sort is 0(N^2) and space is o(1) with no extra space
    public static void main(String[] args) {
        int[] arr = {34, 65, 2, 9, 4, -89,12, 83};
        //In the bubble sort algorithm we start with the starting element of the array comparing with adjacent element of the array
        // and if first element is greater than second then we have to swap it ,
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
