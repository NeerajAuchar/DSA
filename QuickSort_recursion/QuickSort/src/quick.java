import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
            int[] arr ={5, 4, 3, 2, 1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums ,int low, int hi){
        if (low>=hi){
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end-start)/2;
        int pivot = nums[mid];

        while (start <=  end){
            while (nums[start]< pivot){
                start++;
            }
            while (nums[end] > pivot){
                end--;
            }
            if (start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

            sort(nums ,  low, end);
            sort(nums, start, hi);
        }
    }
}
