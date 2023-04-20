public class printLlinearly {
    public static void main(String[] args) {
        recur(1,7);

    }

    static  void recur(int i , int n){
        if (i>n){
            return;
        }
        else {

            recur(i+1 ,n);
            System.out.print(i);
        }
    }
}
