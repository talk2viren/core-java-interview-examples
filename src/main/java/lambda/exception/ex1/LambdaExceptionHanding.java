package lambda.exception.ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LambdaExceptionHanding {
    public static void main(String[] args) {
        List<Employee> employees=EmployeesData.getEmployees();

        employees.forEach((emp) -> System.out.println(emp.getEmployeeId()+" :: "+emp.getEmployeeName()));

        try{
            FileWriter writer=new FileWriter("Employee_List.txt");

            for(Employee employee:employees){
                writer.write(employee.toString()+"\n");
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

//        FileWriter writer=new FileWriter("Employee_List.txt");
//        employees.forEach(employee -> writer.write(employee.toString()+" \n"));


    }
}
