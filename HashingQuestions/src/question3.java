import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class question3 {
    public static void main(String[] args) {

        int [] nums = {1,1,2,2,2,3};
        int [] b= topKFrequent(nums , 2);

    }

    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]+1) );
            }else {
                map.put(nums[i], 1 );

            }
        }
        for( int key : map.keySet()){
            if(map.get(key) >= k ){
                ls.add(key);
            }


        }
        int[] ans = new int[ls.size()];
        for(int i=0; i<ls.size() ; i++){
            ans[i]=  ls.get(i);
        }
        return ans;

    }
}
