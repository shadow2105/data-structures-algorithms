public class App {
    public static void main(String[] args) throws Exception {
        
        Employee janeJones = new Employee("Jane", "Jones", 111);
        Employee johnDoe = new Employee("John", "Doe", 222);
        Employee marySmith = new Employee("Mary", "Smith", 333);
        Employee mikeWilson = new Employee("Mike", "Wilson", 444);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();

        list.removeFromFront();
        list.removeFromFront();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();
    }
}
