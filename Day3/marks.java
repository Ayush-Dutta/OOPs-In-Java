import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        int roll[] = new int[n];
        int sub1[] = new int[n];
        int sub2[] = new int[n];
        int sub3[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll number for student " + (i + 1) + ":");
            roll[i] = sc.nextInt();

            
            do {
                System.out.println("Enter marks for subject 1 for student " + (i + 1) + ":");
                sub1[i] = sc.nextInt();
                if (sub1[i] < 0) {
                    System.out.println("Marks cannot be negative. Please enter again:");
                }
            } while (sub1[i] < 0);

            
            do {
                System.out.println("Enter marks for subject 2 for student " + (i + 1) + ":");
                sub2[i] = sc.nextInt();
                if (sub2[i] < 0) {
                    System.out.println("Marks cannot be negative. Please enter again:");
                }
            } while (sub2[i] < 0);

           
            do {
                System.out.println("Enter marks for subject 3 for student " + (i + 1) + ":");
                sub3[i] = sc.nextInt();
                if (sub3[i] < 0) {
                    System.out.println("Marks cannot be negative. Please enter again:");
                }
            } while (sub3[i] < 0);
        }

        int max = 0, k = 0, max1 = 0, max2 = 0, max3 = 0, k1 = 0, k2 = 0, k3 = 0;

        for (int i = 0; i < n; i++) {
            int marks = sub1[i] + sub2[i] + sub3[i];
            System.out.println("Student " + roll[i] + " = " + marks);
            if (marks > max) {
                max = marks;
                k = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (sub1[i] >= max1) {
                max1 = sub1[i];
                k1 = roll[i];
            }
            if (sub2[i] >= max2) {
                max2 = sub2[i];
                k2 = roll[i];
            }
            if (sub3[i] >= max3) {
                max3 = sub3[i];
                k3 = roll[i];
            }
        }

        System.out.println("The highest marks in subject 1 is " + max1 + " and the roll number is " + k1);
        System.out.println("The highest marks in subject 2 is " + max2 + " and the roll number is " + k2);
        System.out.println("The highest marks in subject 3 is " + max3 + " and the roll number is " + k3);

        System.out.println("Student " + roll[k] + " has the highest total marks.");

        sc.close();
    }
}
