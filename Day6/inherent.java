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
    double Area()
    {
        return -1;
    }
      
}

class Trapezoid extends Quadrilateral
{
    Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        
    }
    @Override double Area()
    {
        
        double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
    }
}

class Parallelogram extends Quadrilateral {
    Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    double Area() {
        double base = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double height = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / base;

        double area = base * height;
        return area;
    }
}


class Rectangle extends Quadrilateral
{
    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        
    }
    @Override double Area()
    {
        
        double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
        
    }
}

class Square extends Quadrilateral
{
    Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        
    }
    @Override double Area()
    {
        double len1= (Math.abs((x1-x2)-(y1-y2)));
        double len2= (Math.abs((x2-x3)-(y2-y3)));
        double len3= (Math.abs((x3-x4)-(y3-y4)));
        double len4= (Math.abs((x4-x1)-(y4-y1)));
        if(len1==len2&&len3==len4&& len2==len3 && len4==len1){
            double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
        }
        System.out.println("This is not squre");
        return -1;
        
    }

}

class Inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Area of Trapezoid");
            System.out.println("2. Area of Parallelogram");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Square");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 5) {
                System.out.println("Exiting program...");
                sc.close();
                System.exit(0);
            }

            System.out.println("Enter the value of x1, y1, x2, y2, x3, y3, x4, y4 : ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            double x4 = sc.nextDouble();
            double y4 = sc.nextDouble();

            switch (ch) {
                case 1:
                    Trapezoid t = new Trapezoid(x1, y1, x2, y2, x3, y3, x4, y4);
                    System.out.println("Area of Trapezoid : " + t.Area());
                    break;
                case 2:
                    Parallelogram p = new Parallelogram(x1, y1, x2, y2, x3, y3, x4, y4);
                    System.out.println("Area of Parallelogram : " + p.Area());
                    break;
                case 3:
                    Rectangle r = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
                    System.out.println("Area of Rectangle : " + r.Area());
                    break;
                case 4:
                    Square s = new Square(x1, y1, x2, y2, x3, y3, x4, y4);
                    System.out.println("Area of Square : " + s.Area());
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}