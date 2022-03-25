import java.util.Stack;

public class StackOperation {
    //add elements
    public static void addElement() {
        StackAndQueue list= new StackAndQueue();
        list.push(56);
        list.push(30);
        list.push(70);
        list.display();
    }

    //show top element in list
    public static void peek(){
        StackAndQueue list= new StackAndQueue();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peek();
    }

    //remove elements
    public static void pop(){
        System.out.println("Before Pop:");
        StackAndQueue list= new StackAndQueue();
        list.push(56);
        list.push(30);
        list.push(70);
        list.display();

        list.pop();
        System.out.println("\nAfter Pop:");
        list.display();
    }

    //create queue
    public static void queueElement() {
        StackAndQueue list =new StackAndQueue();
        list.queue(56);
        list.queue(30);
        list.queue(70);
        list.display();
    }

    //dequeue elements
    public static void dequeueElement(){
        StackAndQueue list =new StackAndQueue();
        list.queue(56);
        list.queue(30);
        list.queue(70);
        System.out.println("Before Pop:");

        list.display();
        list.pop();
        System.out.println("\nAfter Pop:");
        list.display();
    }
}
