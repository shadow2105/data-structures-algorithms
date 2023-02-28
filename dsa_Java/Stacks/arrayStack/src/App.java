public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
        
        stack.printStack();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
}