import java.util.Arrays;

public class beingNeeraj {
    public static void main(String[] args) {
        int[] nums ={ 1,2,3,4,5};
        int [] num = let(nums);
        System.out.println(Arrays.toString(num));
    }

     static int[] let(int [] arr){
        int z =0;
        for (int i=0 ;i< arr.length ; i++){
            for (int j=i+1 ; j< arr.length ;j++){
                z=z+arr[i];
            }
        }
        return arr;
    }
}
