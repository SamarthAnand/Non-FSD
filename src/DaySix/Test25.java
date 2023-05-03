package DaySix;

class Bike extends Q25{
    @Override
    public void wheels(int number){
        System.out.println("The bike has "+number+" wheels");
    }
    public void horn(){
        System.out.println("The bike has horn");
    }
    public void seats(int n){
        System.out.println("The bike has "+n+"seats");


    }
}
class Car extends Q25{
    public void wheels(int number){
        System.out.println("The car has "+number+" wheels");
    }
    public void horn(){
        System.out.println("The car has horn");
    }
    public void seats(int n){
        System.out.println("The car has "+n+"seats");


    }

}
class Bus extends Q25{
    public void wheels(int number){
        System.out.println("The bus has "+number+" wheels");
    }
    public void horn(){
        System.out.println("The bus has horn");
    }
    public void seats(int n){
        System.out.println("The bus has "+n+"seats");

    }

}
public class Test25 {
    public static void main(String[] args) {
        Q25 bike = new Bike();
        Q25 car = new Car();
        Q25 bus = new Bus();

        bike.seats(2);
        car.wheels(4);
        bus.horn();

    }


}
