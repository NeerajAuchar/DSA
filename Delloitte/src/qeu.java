import java.util.ArrayList;
import java.util.List;

public class qeu {
    public static void main(String[] args) {

  
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ls.add(i);
        }
        doub(ls);
    }
     public static int solve(String q){
         for (int i = 0; i <q.length() ; i++) {
             char c = q.charAt(i);

             if(q.indexOf(c)==q.lastIndexOf(c)){
                 return i;
             }
         }
             return -1;
     }
     public static void doub(List<Integer> ls ){
        for(int i=0 ; i<ls.size() ; i++){
            System.out.println(2*ls.get(i));
        }
     }

}
