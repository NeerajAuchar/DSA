import java.util.Arrays;
// Bubble Sorting Syntax (Code)
public class bubble {
    public static void main(String[] args) {

        int[] arr ={ 12, 65, -90, 0, -12, 37, 78};
        bsorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bsorting(int[] arr){
        boolean swap;

        for (int i=0 ;i < arr.length ; i++){
            swap=false;
            for (int j=1 ; j< arr.length-i ; j++){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }

            if(swap==false){
                break;
            }
        }

    }
}
