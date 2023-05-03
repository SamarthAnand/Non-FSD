package OopsConcept.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPercent {
    public static double findPercent(double marks){
        return (marks*100)/500;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student > students = new ArrayList<>();
        for(int i =0;i<5;i++) {
            int rollNo = sc.nextInt();
            String name = sc.next();
            double marks = sc.nextDouble();

            Student st = new Student(name, rollNo,marks);
            students.add(st);
        }

        for(Student s : students){
            System.out.println(s.name +" has recieved "+findPercent(s.marks)+" % marks");

        }
    }
}
