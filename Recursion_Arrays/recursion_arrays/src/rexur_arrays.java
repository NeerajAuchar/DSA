public class rexur_arrays {
    // Q: State weather the array is sorted or not using recursion

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 4, 5, 6, 7};

        System.out.println(f(arr,0));

    }

    static boolean f(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && f(arr ,index+1);
    }
}
