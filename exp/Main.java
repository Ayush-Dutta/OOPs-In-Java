import java.util.Scanner;

class Quadrilateral {
    protected double x1, y1, x2, y2, x3, y3, x4, y4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
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
        // Calculate the area of Trapezoid using the formula:
        // Area = ((x2 - x1) + (x4 - x3)) / 2 * (y3 - y1)
        return 0.5 * ((x2 - x1) + (x4 - x3)) * (y3 - y1);
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        // Calculate the area of Parallelogram using the formula:
        // Area = |(x2 - x1)(y3 - y1) - (x3 - x1)(y2 - y1)|
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));
    }
}

class Rectangle extends Quadrilateral {
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        // Calculate the area of Rectangle using the formula:
        // Area = (x2 - x1) * (y3 - y1)
        return (x2 - x1) * (y3 - y1);
    }
}

class Square extends Rectangle {
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double area() {
        // Calculate the area of Square using the formula:
        // Area = side * side
        double side = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return side * side;
    }
}

public class Main {
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
        Trapezoid trap = new Trapezoid(x1, y1, x2, y2, x3, y3, x4, y4);
        Parallelogram para = new Parallelogram(x1, y1, x2, y2, x3, y3, x4, y4);
        Rectangle rect = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
        Square sq = new Square(x1, y1, x2, y2, x3, y3, x4, y4);

        // Output areas
        System.out.println("Area of Trapezoid: " + trap.area());
        System.out.println("Area of Parallelogram: " + para.area());
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Square: " + sq.area());
    }
}
