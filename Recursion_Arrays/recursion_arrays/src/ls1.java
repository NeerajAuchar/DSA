import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ls1 {
    public static void main(String[] args) {
        int[] arr ={9,81,33,17,58,42,8,75};
        System.out.println(Arrays.toString(separateDigits(arr)));

    }
    static int[] separateDigits(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();


        for(int i=0 ; i<nums.length ; i++){
            if(10<nums[i] && nums[i+1]<10){
                return nums;
            }
            ls.add(nums[i]/10);
            ls.add(nums[i]%10);
        }
        int[] ans =new int[ls.size()];

        for (int i = 0; i <ls.size() ; i++) {

            ans[i]=ls.get(i);

        }

        return ans;
    }

    static int[] separateDigits1(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();


    for (int i = nums.length-1 ; i>=0 ; i--){
        int temp = nums[i];
        while (temp>0){

        }
    }
        int[] ans =new int[ls.size()];

        for (int i = 0; i <ls.size() ; i++) {

            ans[i]=ls.get(i);

        }

        return ans;
    }



}
