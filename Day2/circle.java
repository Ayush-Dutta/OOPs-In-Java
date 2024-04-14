import java.util.Scanner;
import java.lang.Math;
class Circle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        double circumference = 2 * 3.14 * r;
	double X = Math.ceil(area * 100) / 100;
        System.out.println("Area of the circle : " + X );
	double Z = Math.ceil(circumference * 100) / 100;
        System.out.println("Circumference of the circle : " + Z);
    }
}
