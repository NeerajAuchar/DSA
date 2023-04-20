import java.util.Arrays;

public class tryti {



        public static void main(String[] args) {
            int[] arr ={0, 2, 1, 5, 3, 4};

            int [] nums = findNeeraj(arr);
            System.out.println(Arrays.toString(nums));
        }

        static  int[] findNeeraj(int[] arr){
            int [] amm = new int [arr.length];
            for (int i=0 ;i<arr.length ;i++){
                amm[i]=arr[arr[i]];
            }

            return amm;
        }
}


