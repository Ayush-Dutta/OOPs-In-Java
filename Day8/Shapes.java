import java.util.Scanner;
import iooperations.*;
import org.shapes.*;
public class Shapes {
	public static void main(String[] args) {
		InputOperations input = new InputOperations();
		OutputOperations output = new OutputOperations();
		Scanner scanner = new Scanner(System.in);
		Boolean f= true;

		while (f) {
			output.print("Choose a shape:");
			output.print("1. Circle");
			output.print("2. Square");
			output.print("3. Triangle");
			output.print("4. Exit");
			output.print("Enter Your Choice: ");

			int choice = input.readInt();

			switch (choice) {
				case 1:
					output.print("Enter the radius of the circle: ");
					double radius = input.readDouble();
					Circle circle = new Circle(radius);
					output.print("Area: " + circle.getArea());
					output.print("Perimeter: " + circle.getPerimeter());
					break;
				case 2:
					output.print("Enter the side length of the square: ");
					double side = input.readDouble();
					Square square = new Square(side);
					output.print("Area: " + square.getArea());
					output.print("Perimeter: " + square.getPerimeter());
					break;
				case 3:
					output.print("Enter the length of side 1 of the triangle: ");
					double side1 = input.readDouble();
					output.print("Enter the length of side 2 of the triangle: ");
					double side2 = input.readDouble();
					output.print("Enter the length of side 3 of the triangle: ");
					double side3 = input.readDouble();
					Triangle triangle = new Triangle( side1, side2, side3);
					output.print("Area: " + triangle.getArea());
					output.print("Perimeter: " + triangle.getPerimeter());
					break;
				case 4:
					output.print("Exiting program...");
					f = false;
					break;
				default:
					output.print("Invalid choice!");
			}
		}
		scanner.close();
	}
}
