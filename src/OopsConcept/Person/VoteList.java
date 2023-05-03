package OopsConcept.Person;

import java.util.*;


public class VoteList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);

        for(int i =0;i<10;i++){
            int age = sc.nextInt();
            String name = sc.next();
            String gender = sc.next();

            Person p = new Person(name, age, gender);
            persons.add(p);
        }
//
//        Collections.sort(persons);

        for(Person person :persons ){
            if(person.getAge() >= 18){
                System.out.println(person);
            }
        }



    }
}

//input :
//12 H M
//        18 M <
//19 M M
//        10 P M
//        20 M M
//        40 O F
//        45 I F
//        1 J F
//        29 P M
//        28 U F