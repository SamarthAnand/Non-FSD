package OopsConcept.Car;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Honda", "City", "2011");
        cars.add(car1);
        Car car2 = new Car("BMW", "X1", "2018");
        cars.add(car2);
        Car car3 = new Car("Audi", "Spyder", "2022");
        cars.add(car3);
        Car car4 = new Car("Pagani", "Zonda", "2019");
        cars.add(car4);
        Car car5 = new Car("Mercedes", "S40", "2023");
        cars.add(car5);

        for(Car c :  cars){
            System.out.println("Name => "+c.getMake()+"\n Model => "+c.getModel()+"\n Year => "+c.getYear());
        }
    }
}
