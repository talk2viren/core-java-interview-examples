package obj.compare.comperator;

public class Employee{
    public int employeeId;
    public String Name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        Name = name;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", Name='" + Name + '\'' +
                '}';
    }
}
