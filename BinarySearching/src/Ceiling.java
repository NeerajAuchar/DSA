public class Ceiling {
    public static void main(String[] args) {
        int [] nums ={ 2, 3, 5, 7, 9, 14, 15, 18, 20, 24, 27};
        int target =10;
        int ans = searching(nums ,target);
        System.out.println(ans);
    }

    static int searching(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start <=end ){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end =mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;

            }else {
                return  mid;
            }

        }
        return start;
    }
}
