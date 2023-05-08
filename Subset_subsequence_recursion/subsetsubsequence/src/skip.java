public class skip {
    // i/p = "neeraj" target='e' o/p="nraj"
    public static void main(String[] args) {
        skip("","neeraj");

    }
    static void skip(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch=='e'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }
}
