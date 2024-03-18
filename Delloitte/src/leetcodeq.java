import java.util.Arrays;

public class leetcodeq {
    public static void main(String[] args) {
        int[] arr = {0,0};

        System.out.println(Arrays.toString(productExpSelf(arr)));

    }

    static int[] productExpSelf(int[]  arr){
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int coun =1;
            for(int num : arr){
                if(arr[i] == num) {
                    continue;
                }else {
                    coun *= num;
                }
            }
            ans[i] = coun;

            }
        return ans;
    }
}
