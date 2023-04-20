public class factorialRecur {
    // Return the factorial number of i/p
    public static void main(String[] args) {
        System.out.println(f(10));

    }

    static int f(int n){
        if(n<= 0){
            return 1;
        }

        return n*f(n-1);
    }
}
