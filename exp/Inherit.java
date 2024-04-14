import java.util.*;

class Quadrilateral 
{
	double x1;
	double y1;
	double x2;
	double y2;
	double x3;
	double y3;
	double x4;
	double y4;
	Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;	
	}
}
class Trapezoid extends Quadrilateral {
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        double base1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double base2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        double height = Math.abs(y2 - y1); // Assuming the trapezoid is not tilted

        return 0.5 * (base1 + base2) * height;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }
}

class Rectangle extends Quadrilateral {
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        return (x2 - x1) * (y3 - y1);
    }
}

class Square extends Rectangle {
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        double side = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return side * side;
    }
}


public class Inherit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of the quadrilateral (x1 y1 x2 y2 x3 y3 x4 y4):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
	Quadrilateral quad = new Quadrilateral(x1, y1, x2, y2, x3, y3, x4, y4);

	while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Area of Trapezoid");
            System.out.println("2. Area of Parallelogram");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Square");
            System.out.println("5. Exit");
	System.out.print("Enter your choice: ");
            int ch = scanner.nextInt();

	switch (ch) {
                case 1:
		    Trapezoid trap = new Trapezoid(x1, y1, x2, y2, x3, y3, x4, y4);
		    System.out.println("Area of Trapezoid: " + trap.area());
                    break;
                case 2:
                    Parallelogram para = new Parallelogram(x1, y1, x2, y2, x3, y3, x4, y4);
		    System.out.println("Area of Parallelogram: " + para.area());
                    break;
                case 3:
                    Rectangle rect = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
		    System.out.println("Area of Rectangle: " + rect.area());
                    break;
                case 4:
                    Square sq = new Square(x1, y1, x2, y2, x3, y3, x4, y4);
		    System.out.println("Area of Square: " + sq.area());
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}