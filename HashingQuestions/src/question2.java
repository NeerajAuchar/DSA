import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        int[] arr1 ={7, 3, 9};
        int[] arr2 ={4, 3, 9, 2, 9, 4};
        intersection(arr1,arr2);

    }

    static void intersection( int[] arr1 , int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        int count=0;
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for (int i=0 ; i < arr2.length ; i++){
            if(set.contains(arr2[i])){
                count++;
                ls.add(arr2[i]);
                set.remove(arr2[i]);

            }
            ls.ge

        }

        System.out.println(count);
        System.out.println(ls);
    }
}
