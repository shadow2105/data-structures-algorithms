import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        System.out.println("\n");

        HashMap<Integer, Employee> employeeTable = new HashMap<Integer, Employee>();

        ListIterator<Employee> iter = employees.listIterator();
        List<Employee> remove = new ArrayList<Employee>();
        while(iter.hasNext()) {
            Employee employee = iter.next();
            if(employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            }
            else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for(Employee employee: remove) {
            employees.remove(employee);
        }
        
        employees.forEach(e -> System.out.println(e));

    /*  HashMap<Integer, Employee> ht = new HashMap<Integer, Employee>();

        employees.forEach(e -> ht.put(e.getId(), e));

        employees.clear();

        ht.forEach((k, v) -> employees.add(v));

        employees.forEach(e -> System.out.println(e));
    */

    }
}

