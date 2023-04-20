

//Example of copy construtor

public class Oop {
    public static void main(String[] args) {
//        pen obj= new pen();
//        obj.colour = "Red";
//        obj.type="gel pen";
//        obj.writeColour();
//
//
//        pen obj1= new pen();
//        obj1.colour ="blue";
//        obj1.writeColour();

        neeraj n1 = new neeraj();
        n1.name="Neeraj";
        n1.age=20;

        neeraj n2= new neeraj(n1);
        n1.printInfo();

    }
}
class neeraj{


    public  void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    String name;
    int age;

    // Non-parametrized constructor

    neeraj(neeraj n2){

        this.name=n2.name;
        this.age=n2.age;

    }
    neeraj(){

    }
}