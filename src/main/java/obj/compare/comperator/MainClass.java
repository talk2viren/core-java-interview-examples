package obj.compare.comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*This usecase can be used for VO where programer is having option to modify. If VO is coming as part of external library and programer cannot modify, using comperator is only option left*/
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Compare Objects");

        Employee employee1 = new Employee(1,"Employee 1 Name");
        Employee employee2 = new Employee(2,"Employee 2 Name");
        Employee employee3 = new Employee(3,"Employee 3 Name");

        List<Employee> employeesList= new ArrayList<>();
        employeesList.add(employee2);
        employeesList.add(employee1);
        employeesList.add(employee3);

        System.out.println("Before sort Comperator ########");
        employeesList.forEach(emp -> System.out.println(emp.toString()));

        Collections.sort(employeesList,new ComperatorImpl());

        System.out.println("After sort  Comperator ########");
        employeesList.forEach(emp -> System.out.println(emp.toString()));

/*      Program Output
        ==============

        Compare Objects
        Before sort Comperator ########
        Employee{employeeId=2, Name='Employee 2 Name'}
        Employee{employeeId=1, Name='Employee 1 Name'}
        Employee{employeeId=3, Name='Employee 3 Name'}
        After sort  Comperator ########
        Employee{employeeId=1, Name='Employee 1 Name'}
        Employee{employeeId=2, Name='Employee 2 Name'}
        Employee{employeeId=3, Name='Employee 3 Name'}
*/



    }
}
