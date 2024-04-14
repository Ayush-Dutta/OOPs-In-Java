import java.util.Scanner;

class Stack {
    int[] arr;
    int top;
    int maxSize;

    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push element.");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int getSize() {
        return top + 1;
    }
}

public class StackMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack1:");
        Stack stack1 = new Stack(sc.nextInt());
        System.out.println("Enter size of stack2:");
        Stack stack2 = new Stack(sc.nextInt());

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push element into Stack 1");
            System.out.println("2. Push element into Stack 2");
            System.out.println("3. Pop element from Stack 1");
            System.out.println("4. Pop element from Stack 2");
            System.out.println("5. Check if Stack 1 is empty");
            System.out.println("6. Check if Stack 2 is empty");
	    System.out.println("7. View elements in Stack 1");
	    System.out.println("8. View elements in Stack 2");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element to push into Stack 1: ");
                    int element1 = sc.nextInt();
                    stack1.push(element1);
                    checkEquality(stack1, stack2);
                    break;
                case 2:
                    System.out.print("Enter element to push into Stack 2: ");
                    int element2 = sc.nextInt();
                    stack2.push(element2);
                    checkEquality(stack1, stack2);
                    break;
                case 3:
                    if (stack1.isEmpty()) {
                        System.out.println("Stack Underflow! Cannot pop element.");
                        break;
                    }
                    if (!stack1.isEmpty()) {
                        System.out.println("Popped element from Stack 1: " + stack1.pop());
                    }
		    checkEquality(stack1, stack2);
                    break;
                case 4:
                    if (stack2.isEmpty()) {
                        System.out.println("Stack Underflow! Cannot pop element.");
                        break;
                    }
                    if (!stack2.isEmpty()) {
                        System.out.println("Popped element from Stack 2: " + stack2.pop());
                    }
		    checkEquality(stack1, stack2);
                    break;
                case 5:
                    System.out.println("Stack 1 is " + (stack1.isEmpty() ? "empty" : "not empty"));
                    break;
                case 6:
                    System.out.println("Stack 2 is " + (stack2.isEmpty() ? "empty" : "not empty"));
                    break;
		case 7:
    		    System.out.println("Elements in Stack 1:");
    		    for (int i = stack1.top; i >= 0; i--) {
        			System.out.println(stack1.arr[i]);
    			}
    		    break;
		case 8:
    		    System.out.println("Elements in Stack 2:");
    		    for (int i = stack2.top; i >= 0; i--) {
        			System.out.println(stack2.arr[i]);
    			}
    		    break;			
                case 9:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }

    public static void checkEquality(Stack stack1, Stack stack2) {
        if (stack1.getSize() == stack2.getSize()) {
            System.out.println("Number of elements in Stack 1 and Stack 2 are equal: " + stack1.getSize());
        }
    }
}
