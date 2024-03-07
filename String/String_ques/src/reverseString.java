public class reverseString {
    public static void main(String[] args) {
        String s = "neeraj";
        reversS(s);

    }

    static void reversS(String s){

        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
        //method1
        System.out.println(" ");
        char[] arr = s.toCharArray();
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
        //method2
        System.out.println(' ');
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Using method-2 : "+ sb.reverse());
    }
}
