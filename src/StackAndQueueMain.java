public class StackAndQueueMain {
    public static void main(String args[]) {
        System.out.println("Welcome To Stack and Queue Problem");

        System.out.println("\n===================");

        //Create Stack
        System.out.println("Create Stack");
        StackOperation.addElement();
        System.out.println("\n===================");

        //Top element in stack
        System.out.println("Top element in stack");
        StackOperation.peek();
        System.out.println("\n===================");

        //Delete last element
        System.out.println("Delete last element from stack");
        StackOperation.pop();
        System.out.println("\n===================");

        //Create Queue
        System.out.println("Create Queue");
        StackOperation.queueElement();
        System.out.println("\n===================");

        //Delete elements
        System.out.println("Dequeue Elements");
        StackOperation.dequeueElement();
        System.out.println("\n===================");
    }
}
