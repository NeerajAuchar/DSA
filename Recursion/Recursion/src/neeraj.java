public class neeraj {
    public static void main(String[] args) {

        System.out.println(f(6));

    }

    public static int  f(int n ){
        if(n<2){
            return n;
        }
        return f(n-1)+f(n-2);

    }
}
