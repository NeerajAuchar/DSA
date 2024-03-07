import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int[] arr ={ 3, 2, 6, 1, 8, 4, 99, -1};
        count_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void count_Sort(int[] arr){

        if(arr == null || arr.length <= 1){
            return;
        }
        int max = arr[0];
        for( int num : arr){
            if(num > max){
                max = num;
            }
        }

        int[] countArray = new int[max+1];
        for (int num : arr){
            countArray[num]++;
        }
        int index = 0;
        for (int i=0 ; i<=max ; i++){
            while (countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }


    }

}
