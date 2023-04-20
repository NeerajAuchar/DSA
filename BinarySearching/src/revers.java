import java.util.Arrays;

public class revers {
    public static void main(String[] args) {
        int[] arr={ 6, 4, 3, 2, 1};
        int[] ans= swap(arr);
        System.out.println(Arrays.toString(ans));

    }

  static int[] swap(int[] nums){
        int start =nums[0];
        int end = nums.length-1;
        while(start > end){
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=nums[start];
        }
        return nums;
    }
}
