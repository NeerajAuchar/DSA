import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class btracking {
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();

        int[] arr = {1,2,3};
        backtraking(ls, new ArrayList<>() , arr , 0);

    }


    static void backtraking(List<List<Integer>> resultset , List<Integer> temp , int[] arr , int num){
        resultset.add(new ArrayList<>(temp));
        for (int i=0 ; i< arr.length ; i++){
            temp.add(arr[i]);
            backtraking(resultset ,temp , arr , i+1);
            temp.remove(temp.size()-1);
        }
    }
}
