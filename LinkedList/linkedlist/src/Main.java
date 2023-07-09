public class Main {
    public static void main(String[] args) {
        ll list =new ll();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insterlast(12);
        list.insterlast(99);
        list.insert(98,5);
        list.insert(90,4);
        list.display();
        System.out.println(list.delfirst());
        list.display();
    }
}