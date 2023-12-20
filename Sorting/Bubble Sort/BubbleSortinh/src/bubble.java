import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = { 3, 67, 34, 89, 23, 12};
        bubbleSort(arr);

    }


    static void bubbleSort(int[] arr){
        //external loop
        for (int i = 0; i < arr.length; i++) {
            //internal loop
            for (int j = 1; j < i ; j++) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
