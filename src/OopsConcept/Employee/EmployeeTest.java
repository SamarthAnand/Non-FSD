package OopsConcept.Employee;

import java.util.*;

class SortBySalary implements Comparator<Employee> {

    public int compare(Employee a, Employee b){
        return (int)(a.getSalary() - b.getSalary());
    }
}
public class EmployeeTest {


    public static void main(String[] args) {
        String name;
        int employeeId;
        double salary;

        Scanner sc = new Scanner(System.in);
        List<Employee> empList = new ArrayList<>();
        int t =0;

        while(t<5) {

            EmployeeTest emp = new EmployeeTest();
            System.out.println("Enter employee Name  : ");
            name = sc.next();

            System.out.println("Enter employee Id : ");
            employeeId = sc.nextInt();


            System.out.println("Enter employee Salary : ");
            salary = sc.nextDouble();

            Employee employee = new Employee(name, employeeId, salary);
            empList.add(employee);
            t++;
        }

        Comparator c = Collections.reverseOrder(new SortBySalary());
        Collections.sort(empList,c);
        System.out.println(empList);
    }
}
