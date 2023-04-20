import java.util.ArrayList;
import java.util.Arrays;

public class returning_arrayList {
    public static void main(String[] args) {
        int [] arr={1, 5, 7, 23, 89, 34, 7};
        System.out.println(findIndex(arr,7,0,new ArrayList<>()));

    }

    static ArrayList<Integer> findIndex(int [] arr , int target , int index , ArrayList<Integer> list){

        if (index==arr.length){
            return list;
        }

        if(arr[index]== target){
            list.add(index);
        }
        return findIndex(arr ,  target ,index+1 ,  list);


    }
}
