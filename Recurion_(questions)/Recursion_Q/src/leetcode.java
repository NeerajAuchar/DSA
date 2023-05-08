import java.awt.*;
import java.util.ArrayList;

public class leetcode {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ls = null;
        int count=0 ;
        for (int i = 0; i < nums.length ; i++) {
           for (int j=i+1; i< nums.length ; i++){
               if (nums[i]>nums[j]) {

                   count = count + nums[i];
               }
               for(int a =0 ; i<=count ; a++){
                   for (int b =0 ; b<= nums.length ; b++ ){
                       if (a != nums[b]) {
                           ls.add(a);
                       }
                   }
               }

           }

        }
    }
}
