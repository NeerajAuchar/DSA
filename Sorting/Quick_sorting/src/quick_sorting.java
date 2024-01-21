import java.util.Arrays;

public class quick_sorting {
    public static void main(String[] args) {
        int [] arr = {3, 5, 23, 90, 8, 1, 0, 78};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int i = s-1;
        for (int j = s; j < e; j++) {
            if(arr[j] < pivot){
                i++;
                //swap
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
        if(s < e ){
            int pivotIndex = partition(arr, s, e);
            quickSort(arr, s, pivotIndex-1);
            quickSort(arr, pivotIndex+1, e);
        }


    }
}

