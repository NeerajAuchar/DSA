import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 9, 6, 8, -21, 89, 4,-8 };
        divided(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void conqure(int[] arr, int si, int mid, int ei){
        int[] merge = new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;
        while (indx1 <= mid && indx2 <= ei){
            if(arr[indx1] <= arr[indx2]){
                merge[x++] = arr[indx1++];
            }else {
                merge[x++] = arr[indx2++];
            }
        }
        while (indx1 <= mid){
            merge[x++] = arr[indx1++];
        }
        while (indx2 <= ei){
            merge[x++] = arr[indx2++];
        }

        for (int i = 0, j=si; i < merge.length ; i++, j++) {
            arr[j] = merge[i];
        }

    }

    static void divided(int[] arr, int si, int ei){
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        divided(arr, si, mid);
        divided(arr,mid+1, ei);
        conqure(arr, si, mid, ei);
    }

}
