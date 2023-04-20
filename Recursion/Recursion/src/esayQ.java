public class esayQ {


    //  print the N numbers in  decending order
    public static void main(String[] args) {
        fDecen(5);
//        System.out.println(f(5););

    }
    static void fDecen(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fDecen(n-1);
    }


    static  void fAscen(int n){
        if(n==0){
            return;
        }
        fAscen(n-1);
        System.out.println(n);
    }

    static void fboth(int n){

        if(n==0){
//            System.out.println(1);
            return;
        }
        System.out.println(n);

        fboth(n-1);
        System.out.println(n);

    }
}
