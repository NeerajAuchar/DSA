public class addInt {

    // return the addtion of given input number eg: i/p = 12345  o/p = 15
    // explanation 1+2+3+4+5
    public static void main(String[] args) {
        System.out.println(f(12345));

    }

    static int f(int n){
        if(n==0){
            return n;
        }
        return n%10 +f(n/10);
    }
}
