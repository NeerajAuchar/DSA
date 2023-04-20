public class recursion {
    static int c = 0;

    public static void main(String[] args) {
        reuc();

    }

    static void reuc() {
        if (c == 5) {
            return;

        } else {
            System.out.println(c);
            c++;
            reuc();
        }

    }
}
