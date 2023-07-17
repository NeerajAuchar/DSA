import javax.sound.midi.Soundbank;
import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.HashSet;

public class question1 {


    static void union (int[] arr1 , int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0 ; i< arr1.length ; i++){
            hs.add(arr1[i]);
        }
        for (int i=0 ; i< arr2.length ; i++){
            hs.add(arr2[i]);
        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        int[] arr1 ={7, 3, 9};
        int[] arr2 ={6, 3, 9, 2, 9, 4};
        union(arr1,arr2);

    }
}
