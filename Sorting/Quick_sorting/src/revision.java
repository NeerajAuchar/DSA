import java.util.Arrays;

public class revision {
    public static void main(String[] args) {
        int[] arr = { 23, 67, 2, 9, 1, 3, 78, -9, 0, 23, -36};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

    static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int i = s-1;
        for (int j = s; j < e ; j++){

            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;

        return i;
    }

    static void quickSort(int[] arr, int s, int e){
        if(s < e){
            int pivotIndx = partition(arr, s, e);
            quickSort(arr, s, pivotIndx-1);
            quickSort(arr, pivotIndx+1, e);
        }
    }
}
