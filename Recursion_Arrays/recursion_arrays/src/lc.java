
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7};
        System.out.println(f(arr));
//        System.out.println(Arrays.toString(f(arr)));
    }


    static List<Integer> f(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = i + 1;
        while (i <= nums.length) {
            while (j < nums.length) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                j++;
            }
            i++;
        }
        int ch = nums[nums.length - 1];
        int a = 0;
        int b = 0;
        while (a < ch) {
            while (b <nums.length) {
                if (a != nums[b]) {
                    list.add(a);
                }

                a++;
                b++;
            }

        }
        return list;
    }}






