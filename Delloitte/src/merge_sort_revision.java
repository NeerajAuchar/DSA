import java.util.Arrays;

public class merge_sort_revision {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6, 2, 0, 7, 8, 4, 2, 5};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void conqure(int[] arr, int start, int mid, int end){

        int[] ans = new int[end-start+1];
        int idx1 =start;
        int idx2 = mid+1;
        int x = 0;


        while (idx1 <= mid && idx2 <= end){
        if(arr[idx1] <= arr[idx2]){
            ans[x++] = arr[idx1++];
        }else {
            ans[x++] = arr[idx2++];
        }
        }

        while (idx1 <= mid){
            ans[x++] = arr[idx1++];
        }
        while (idx2 <= end){
            ans[x++] = arr[idx2++];
        }
        for (int i = 0, j=start; i < ans.length ; i++, j++) {
            arr[j] = ans[i];

        }
    }

    static void divide(int [] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conqure(arr, start, mid, end);
    }
}
