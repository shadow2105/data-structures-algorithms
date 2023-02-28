public class EmployeeNode {
    
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
        // this.next = null; no need to set null as it the default value for non-initialized (class object) fields.
    }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public EmployeeNode getNext() { return next; }
    public void setNext(EmployeeNode next) { this.next = next; }

    @Override
    public String toString() {
        return employee.toString();
    } 
}
