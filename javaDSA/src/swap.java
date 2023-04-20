import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr ={1, 3 ,89 ,34 ,10};
        System.out.println("Given arr" + Arrays.toString(arr));
        swap(arr , 1 , 3);
    }

    static  void swap(int arr[], int a , int b){
        int temp  = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
