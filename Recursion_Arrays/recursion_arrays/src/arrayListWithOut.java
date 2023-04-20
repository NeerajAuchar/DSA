import java.util.ArrayList;

public class arrayListWithOut {
    public static void main(String[] args) {
        int [] arr ={1, 45, 78 , 34, 90, 45};
        System.out.println(findIndex(arr, 45,0));

    }

    static ArrayList<Integer> findIndex(int [] arr , int target , int index ){
        ArrayList<Integer> list =new ArrayList<>();

        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelow = findIndex(arr , target,index+1);
        list.addAll(ansFromBelow);
        return  list;

    }
}
