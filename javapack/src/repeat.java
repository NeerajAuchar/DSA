import java.util.Arrays;

public class repeat {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int []ans =doIt(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] doIt(int [] nums){
        for (int i=0; i<6;i++){
            nums[i]=nums[i];
        }
        return nums;
    }
}
