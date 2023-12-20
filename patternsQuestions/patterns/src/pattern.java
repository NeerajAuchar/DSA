public class pattern {
    public static void main(String[] args) {
        pat9(5);

    }

    static void pat1(int n){
        //rectangle
        for (int i=0 ; i<n ;i++){
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pat2(int n , int m){
        // holo rectangle
        for (int i=1 ; i<=n ;i++){
            for (int j = 1; j <=m ; j++) {
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }


    static void pat3(int n){
        // half pyramid
        for (int i=1 ; i<=n ;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pat4(int n){
        // inverted half pyramid
        for (int i=1 ; i<=n ;i++){
            for (int j = n; j-i+1>=1 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pat5(int n){
        // inverted half pyramid rotated by 180 degree
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pat6(int n){
        // half pyramid with numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void pat7(int n){
        // inverted half pyramid with numbers
        for (int i =1; i<=n  ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void pat8(int n){
        int num=1;
        // floyd;s triangle
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");

        }
    }

    static void pat9(int n){
        // 0-1 triangle
        for (int i = 1; i <=n; i++) {
            for (int j=1 ; j<=i ; j++ ){
                if((i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }

    static void pat10(int n){
        // butterfly pattern
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                
            }
        }
    }
}
