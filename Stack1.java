import java.util.*;

public class Stack1 {
    int stack[];
    int n = 100;
    int top = -1;

    
    public Stack1() {
        stack = new int[n];
    }

    
    public void pop() {
        if (top <= -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("\nTop value removed from stack: " + stack[top]);
            top--;
        }
    }

    
    public void push(int value) {
        if (top >= n - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++; 
            stack[top] = value;
        }
    }

    
    public void display() {
        if (top >= 0) {
            System.out.println("The elements of the stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }

    
    public static void main(String args[]) {
        Stack1 stack = new Stack1(); 

        
        while (true) {
            System.out.println("IMPLEMENTATION OF STACK ADT USING ARRAYS");
            System.out.println("******************************************");
            System.out.println("1....Push\n2....Pop\n3....Display stack\n4....Exit");

            
            Scanner myobj = new Scanner(System.in);
            System.out.println("\nEnter your choice:");
            int choice = Integer.parseInt(myobj.nextLine()); 

            
            switch (choice) {
                case 1:
                    System.out.println("\nEnter the value to push:");
                    int value = Integer.parseInt(myobj.nextLine()); 
                    stack.push(value); 
                    break;

                case 2:
                    stack.pop(); 
                    break;

                case 3:
                    stack.display(); 
                    break;

                case 4:
                    System.exit(0); 
                    break;

                default:
                    System.out.println("\nInvalid Choice. Please try again.");
            }
        }
    }
}