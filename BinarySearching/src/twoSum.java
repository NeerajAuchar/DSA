public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6,};
        int target = 9;
        twoSum obj = new twoSum();
        obj.permutation(nums, target);

    }

    void permutation(int[] arr, int target) {
        int n = 1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + n; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + j);


                } else {
                    n++;
                }


            }
        }
    }
}
