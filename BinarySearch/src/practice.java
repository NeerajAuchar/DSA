import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int [] arr = {4, 3, 6, 9, 3, 2, -1, 8, 4, 0};
        System.out.println(binarySearch(arr,81));

    }

    static  int binarySearch(int[] arr, int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;

            }else if(arr[mid]>target){
                end=mid-1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
