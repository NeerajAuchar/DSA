public class ll {

    private Node head;
    private Node tail;
    private int size;


    public void display(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp =temp.next;
        }
        System.out.println("END");

    }


    public void insert(int val , int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insterlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
        size +=1 ;
    }
    public  void  insterlast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size +=1;
    }
    public  void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size += 1;
    }

    public int delfirst(){
        int val = head.value;
        head =head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
    private  class
    Node{


        public Node(int value) {
            this.value =value;
        }



     private  int value;
     private Node next;

     public Node(Node next) {
         this.next = next;
     }

     public Node(int value, Node next) {
         this.value = value;
         this.next = next;
     }
 }
}
