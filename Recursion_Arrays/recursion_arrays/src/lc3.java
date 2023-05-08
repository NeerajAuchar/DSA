import java.util.ArrayList;

public class lc3 {
    public static void main(String[] args) {
        int[] arr ={0,1};
        System.out.println(f(arr));

    }

    static int f(int[] nums){
        ArrayList<Integer> ls = new ArrayList<>();
        int n =nums.length;
        for(int i=0 ; i< nums.length ; i++){
            for(int j=0; j<n; j++){
                if(nums[i]!=j){
                    ls.add(nums[i]);

                }
            }
        }
        int fnum = ls.get(1);
        return fnum;
    }
}
