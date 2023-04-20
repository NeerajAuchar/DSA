import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Entert the array");
        for (int i=0; i<size ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target element");

        int target =sc.nextInt();

        System.out.println(binarySearching(arr,target));
    }

    static  int binarySearching(int[] nums , int target){
        int start =0;
        int end =nums.length-1;
        while (start<end){
            int mid =start + (end-start)/2;

            if (target < nums[mid]){
                end= mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;

            }else {
                return mid;
            }
        }
        return start;
    }
}
