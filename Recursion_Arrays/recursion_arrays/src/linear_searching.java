import java.awt.desktop.AboutEvent;

public class linear_searching {
    public static void main(String[] args) {
        int[] arr={ 1, 2, 35, 67, 7,90};
        System.out.println(f(arr, 90,0));
    }

    static boolean f(int[] arr , int target , int index){
        if(index==arr.length){
            return false;
        }
       return arr[index]==target || f(arr, target, index+1);
    }
}
