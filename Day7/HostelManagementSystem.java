import java.util.Scanner;

interface Department {
    void getDeptName();
    void getDeptHead();
    void printAttributes();
}

class Hostel {
    String hName;
    String hLocation;
    int numberOfRooms;

    public Hostel(String hName, String hLocation, int numberOfRooms) {
        this.hName = hName;
        this.hLocation = hLocation;
        this.numberOfRooms = numberOfRooms;
    }

    public void printAttributes() {
        System.out.println("Hostel Name: " + hName);
        System.out.println("Location: " + hLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;
    String deptName;
    String deptHead;

    public Student(String studentName, int regdNo, String electiveSubject, double avgMarks, String hName, String hLocation, int numberOfRooms,
                   String deptName, String deptHead) {
        super(hName, hLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    public void printAttributes() {
        super.printAttributes();
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    @Override
    public void getDeptName() {
        System.out.println("Department Name: " + deptName);
    }

    @Override
    public void getDeptHead() {
        System.out.println("Department Head: " + deptHead);
    }
}

public class HostelManagementSystem {
    static Student[] students = new Student[100];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    admitNewStudent(scanner);
                    break;
                case 2:
                    migrateStudent(scanner);
                    break;
                case 3:
                    displayStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }

    private static void admitNewStudent(Scanner scanner) {
        System.out.println("Enter student details:");
        System.out.print("Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Registration Number: ");
        int regdNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Elective Subject: ");
        String electiveSubject = scanner.nextLine();
        System.out.print("Average Marks: ");
        double avgMarks = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Hostel Name: ");
        String hName = scanner.nextLine();
        System.out.print("Hostel Location: ");
        String hLocation = scanner.nextLine();
        System.out.print("Number of Rooms: ");
        int numberOfRooms = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department Name: ");
        String deptName = scanner.nextLine();
        System.out.print("Department Head: ");
        String deptHead = scanner.nextLine();

        Student student = new Student(studentName, regdNo, electiveSubject, avgMarks, hName, hLocation, numberOfRooms, deptName, deptHead);
        students[studentCount++] = student;
        System.out.println("Student admitted successfully!");
    }

    private static void migrateStudent(Scanner scanner) {
        if (studentCount == 0) {
            System.out.println("No students available for migration.");
            return;
        }

        System.out.print("Enter registration number of student to migrate: ");
        int regdNo = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].regdNo == regdNo) {
                System.out.println("Student found. Enter new department details:");
                System.out.print("New Department Name: ");
                String newDeptName = scanner.nextLine();
                System.out.print("New Department Head: ");
                String newDeptHead = scanner.nextLine();

                
                students[i].deptName = newDeptName;
                students[i].deptHead = newDeptHead;

                System.out.println("Student department migrated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with registration number " + regdNo + " not found.");
        }
    }

    private static void displayStudentDetails(Scanner scanner) {
        if (studentCount == 0) {
            System.out.println("No students available for display.");
            return;
        }

        System.out.print("Enter registration number of student: ");
        int regdNo = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].regdNo == regdNo) {
                students[i].printAttributes();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with registration number " + regdNo + " not found.");
        }
    }
}
