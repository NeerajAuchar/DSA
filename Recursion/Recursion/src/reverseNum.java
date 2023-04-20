public class reverseNum {
    static int sum =0;

    static void f(int n){

        if (n==0){
            return;
        }
        int rem = n%10;

        sum = sum*10 + rem;
        f(n/10);
    }

    public static void main(String[] args) {
        f(1234);
        System.out.println(sum);
    }



}
