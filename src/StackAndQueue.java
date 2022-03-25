public class StackAndQueue {
    Node head;
    Node tail;
    Node top;

    //add elements in list
    public void push(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node tempNode = head;
            this.head = newnode;
            newnode.next = tempNode;
        }
        top=head;
    }

    //show top element in list
    public void peek(){
        System.out.println("Top element is "+this.top.data);
    }

    //remove element from list
    public void pop() {
        Node temp =top;
        while (temp != null){
            Node tempNode = this.head;
            this.head = tempNode.next;
            temp=temp.next;
        }
    }

    //create queue
    public void queue(int data) {
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            top=head;
        } else {
            Node tempNode=tail;
            this.tail=newNode;
            tempNode.next=tail;
        }
    }

    //display output
    public void display(){
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }
        else {
            Node tempNode = head;

            //iterate list
            while (tempNode != null) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
        }
    }
}
