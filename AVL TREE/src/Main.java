public class Main {
    public static void main(String[] args) {
        avl tree = new avl();

        for(int i=0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}