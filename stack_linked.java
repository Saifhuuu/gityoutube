import java.util.*;

public class stack_linked {
    private Node head;

    public stack_linked() {
        head = null;
    }

    public void pop() {
        if (head == null) {
            System.out.println("No element is available in stack to pop \n");
        } else {
            int value = head.data;
            head = head.next;
            System.out.println("\nTop value removed from stack is: " + value);
        }
    }

    public void push(int value) {
        Node oldHead = head;
        head = new Node();
        head.data = value;
        head.next = oldHead;
    }

    public static void main(String args[]) {
        stack_linked sls = new stack_linked();
        Scanner myobj = new Scanner(System.in);

        while (true) {
            System.out.println("IMPLEMENTATION OF STACK ADT USING LINKED LIST");
            System.out.println("***************");
            System.out.println("\n1....Push \n2....Pop \n3....Display list \n4....Exit");
            System.out.println("\nEnter your choice:");
            int choice = Integer.parseInt(myobj.nextLine());

            switch (choice) {  // Correct switch statement
                case 1:
                    System.out.println("\nEnter the value to push:");
                    int value = Integer.parseInt(myobj.nextLine());
                    sls.push(value);
                    break;

                case 2:
                    sls.pop();
                    break;

                case 3:
                    DisplayList(sls.head);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void DisplayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("\n%d", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Capitalize 'Node' as per Java conventions
    private class Node {
        int data;
        Node next;
    }
}