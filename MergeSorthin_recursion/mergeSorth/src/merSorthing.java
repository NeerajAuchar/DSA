import java.util.Arrays;

public class merSorthing {
    public static void main(String[] args) {

        int[] arr ={89, 89, 78, 2, 56, 12, 01, -78, -1, 6};
        int [] and = mergeSorthing(arr);
        System.out.println(Arrays.toString(and));

    }

    static int[] mergeSorthing(int[] arr){

        if (arr.length==1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSorthing(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSorthing(Arrays.copyOfRange(arr,mid,arr.length));


        return merge(left,right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix =new int[first.length + second.length];
        int i = 0 ;
        int j = 0 ;
        int k =0 ;

        while (i < first.length &&  j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;

            }else {
                mix[k] = second[j];
                j++;
            }
            k++ ;

        }

        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }


        return mix;
    }


    }




