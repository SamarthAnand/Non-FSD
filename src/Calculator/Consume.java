package Calculator;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Consume {
    public static void main(String[] args) {

//        Person p = new Person();
//        Consumer<Person> setName = t-> t.setName("Samarth");
//        setName.accept(p);
//        System.out.println(p.getName());

//        Function<Integer,String> getName = name -> name+"";
//        System.out.println(getName.apply(2));


        Supplier<Double> getRandomStr =()->Math.random();
        System.out.println(getRandomStr.get()
        );

    }
}
