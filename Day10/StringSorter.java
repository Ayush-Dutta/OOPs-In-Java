import java.util.Scanner;

public class StringSorter {
    static class Container {
        String[] strings;
        int count;

        Container(int maxSize) {
            strings = new String[maxSize];
            count = 0;
        }
    }

    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        Container container = new Container(MAX_SIZE);
        Scanner scanner = new Scanner(System.in);

        Thread inputThread = new Thread(() -> {
            System.out.println("Enter strings (type 'done' to finish):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                if (container.count < MAX_SIZE) {
                    container.strings[container.count] = input;
                    container.count++;
                } else {
                    System.out.println("Maximum limit reached.");
                    break;
                }
            }
        });

        Thread sortThread = new Thread(() -> {
            try {
                inputThread.join();
                
                for (int i = 0; i < container.count - 1; i++) {
                    for (int j = 0; j < container.count - i - 1; j++) {
                        if (container.strings[j].compareTo(container.strings[j + 1]) > 0) {
                           
                            String temp = container.strings[j];
                            container.strings[j] = container.strings[j + 1];
                            container.strings[j + 1] = temp;
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread displayThread = new Thread(() -> {
            try {
                sortThread.join();
                System.out.println("Sorted list:");
                for (int i = 0; i < container.count; i++) {
                    System.out.println(container.strings[i]);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        inputThread.start();
        sortThread.start();
        displayThread.start();
    }
}
