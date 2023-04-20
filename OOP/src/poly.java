
// Polymorphesim Function Overloading

public class poly {

    void printInfo(int age){
        System.out.println(age);

    }
    void printInfo(int age , String name){
        System.out.println(age +" " +  name);
    }
    void printInfo(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        poly obj =new poly();
        obj.printInfo(20 , "neeraj");
    }
}
