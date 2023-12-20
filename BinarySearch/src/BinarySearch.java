import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 90, 87, 45, 79, 4, 12, 34, 43, 56};
        int target = 90;
        int ans = binarySearch(arr ,target);

        System.out.println(ans);

    }

   static int binarySearch(int[] arr , int target){
       Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;

            }else if (target > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}
