public class syntax {
    public static void main(String[] args) {
        int [] nums = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target =15;
        int ans =binarySearch(nums,target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr  ,int target){
        int start =0;
        int end =arr.length-1;
        while (start<=end){
            int mid =start + (end-start)/2;

            if (target < arr[mid]){
                end =mid-1;
            }
            else if (target > arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
