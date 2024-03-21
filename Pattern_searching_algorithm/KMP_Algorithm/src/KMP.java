import java.util.ArrayList;

public class KMP {

   static ArrayList<Integer> KMP_Searching(String pattern , String str){
        ArrayList<Integer> list = new ArrayList<>();
        int lp = pattern.length();
        int ls = str.length();
        int table[] = new int[lp];
        int j=0;
        prefixTable(pattern, lp, table);
        int i =0;
        while (i < ls){
            if (pattern.charAt(j) == str.charAt(i)){
                j++;
                i++;
            }
            if(j == lp){
                list.add((i-j));
                j = table[j-1];
            }else if (i < ls && pattern.charAt(j) != str.charAt(i)){
                if( j!= 0){
                    j = table[j-1];
                }else {
                    i = i+1;
                }
            }
        }
        return list;

    }

   static void prefixTable(String pattern, int M, int[] table){
        int j =0;
        int i = 1;
        table[0] = 0;
        while (i < M){
            if(pattern.charAt(i) == pattern.charAt(j)){
                j++;
                table[i] = j;
                i++;
            }else {
                if( j!= 0){
                    j =table[j-1];
                }else {
                    table[i]=j;
                    i++;
                }
            }
        }

    }
    public static void main(String[] args) {

        String str = "abcdaabcabcdabc";
        String pat ="abcdabc";

        KMP k1 = new KMP();
        System.out.println(k1.KMP_Searching(pat, str));

    }
}
