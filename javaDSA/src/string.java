import java.util.ArrayList;
import java.util.List;

public class string {
    public static void main(String[] args) {
        int[] give = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = new ArrayList<>();
        ans = threeSum(give);
        System.out.println(ans);


    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls2 = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<Integer>();

        for(int i= 0 ; i<nums.length ; i++){
            for(int j=i+1 ; j <nums.length ; j++){
                for(int k=j+1 ; k <nums.length ; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ls1.add(nums[i]);
                        ls1.add(nums[j]);
                        ls1.add(nums[k]);
                        ls2.add(ls1);
                    }

                }
            }
        }
        return ls2;
    }
}
