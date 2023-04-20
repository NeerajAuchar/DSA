public class concept {
    // n-- vs --n
    //the different between this is in first case the number will pass first and the it get subtracted and in second case the number will get subtracted first and then it will pass the number
    public static void main(String[] args) {
        f(5);

    }

    static void f(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        f(--n);
    }
}
