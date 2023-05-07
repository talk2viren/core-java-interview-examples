package obj.compare.comperator;

import java.util.Comparator;

public class ComperatorImpl implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEmployeeId() - e2.getEmployeeId();
    }
}
