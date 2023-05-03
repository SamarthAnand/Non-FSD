package DaySeven;

class A{
    void display1(){
        System.out.println("Inside A");

        }
        }

        class B extends A{
    void display2(){
        System.out.println("inside B");
    }
        }
public class UpCasting {
    public static void main(String[] args) {
        A obj = new B();  //upcasting done automatically
        obj.display1();


        B obj2 =(B) obj; // this is downcasting as A's reference is converted into B's
        obj2.display1();
        obj2.display2();




    }


}
