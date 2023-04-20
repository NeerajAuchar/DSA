
// Q) returning the sum of N eg if n=3 , 3+2+1
public class recusrion {
    public static void main(String [] argus){

        int n=6;
        System.out.println(sum(n));

    }

    static int sum(int n ){
        if (n == 1) {
            return n;

        }
        return  n*sum(n-1);
    }
}
