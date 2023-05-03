package DaySeven;

class A1{
     void display(){
        System.out.println("Inside A class");
    }

    class B{  // this is type of member inner class
        public void display2(){
            System.out.println("Inside B class");
        }

    }

    static class C{  // static inner class
        public void displayC(){
            System.out.println("in static class C");
        }
    }
}
public class InnerClassesDemo {

    public static void main(String[] args) {
        A1 obj = new A1()
        {
            void display(){
                System.out.println("Inside anonymous class");

            }
        };
        obj.display();

        A1.B o2 = obj.new B(); // creating object of B

        o2.display2();


        A1.C o3 = new A1.C();
        o3.displayC();
    }

}
