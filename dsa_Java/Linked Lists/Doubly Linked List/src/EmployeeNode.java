public class EmployeeNode {
    
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
        // this.next = null; no need to set null as it the default value for non-initialized (class object) fields.
        // this.previous = null;
    }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public EmployeeNode getNext() { return next; }
    public void setNext(EmployeeNode next) { this.next = next; }

    public EmployeeNode getPrevious() { return previous; }
    public void setPrevious(EmployeeNode previous) { this.previous = previous; }

    @Override
    public String toString() {
        return employee.toString();
    } 
}
