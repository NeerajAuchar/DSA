public class countzero {

   static  int chek = 0;
    static int f(int n){
        if(n==0){
            return 1;
        }
        if (n%10==0){
            ++chek;
        }
        f(n/10);

        return chek;
    }
    public static void main(String[] args) {

        System.out.println(f(1010200));
    }
}
