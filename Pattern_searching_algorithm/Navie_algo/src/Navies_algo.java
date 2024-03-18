import java.util.ArrayList;
import java.util.Arrays;

public class Navies_algo {
    public static void main(String[] args) {
        String str = "abccbacbabab";
        String pat = "ab";
        System.out.println(findPt(str,pat))   ;

    }

    static ArrayList<Integer> findPt(String str, String pat){
        ArrayList<Integer> ls = new ArrayList<>();
        char[] sarr = pat.toCharArray();
        char[] arr = str.toCharArray();
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] == sarr[0] && arr[i+1]== sarr[1]){
                ls.add(i);
            }
        }
        return ls;
    }


}
