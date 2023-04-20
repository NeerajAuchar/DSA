public class recursion_lec4 {

    // Fibonachii number using recursion
    public static void main(String[] args) {
        int d =f(7);
        System.out.println(d);

    }

    public  static int f(int n){
        if (n<= 1){
            return n;

        }
        int first =f(n-1);
        int last = f(n-2);
        return first+last;

    }
}
