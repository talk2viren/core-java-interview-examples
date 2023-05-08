package lambda.exception.ex1;

import java.util.ArrayList;
import java.util.List;

/*Employee Factory*/
public class EmployeesData {
    public static List<Employee> getEmployees(){
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(101,"Employee 1"));
        empList.add(new Employee(102,"Employee 2"));
        empList.add(new Employee(103,"Employee 3"));
        empList.add(new Employee(104,"Employee 4"));
        empList.add(new Employee(105,"Employee 5"));

        return empList;
    }
}

/*Employee Class*/
class Employee{
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
