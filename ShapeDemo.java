import java.util.Scanner;

abstract class Shape {
    double a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
 Rectangle(double le, double br) {
        a = le;
        b = br;
    }
    void printArea() {
        double area = a * b;
        System.out.println("Area of Rectangle is " + area);
    }
}

class Triangle extends Shape {
Triangle(double le, double br) {
        a = le;
        b = br;
    }
    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle is " + area);
    }
}

class Circle extends Shape {
Circle(double le) {
        a = le;
    }
    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of Circle is " + area);
    }
}

class ShapeDemo {
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:Krithika\nUSN:1BM23CS159");

        System.out.println("Enter the dimensions of Rectangle");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(a, b);

        System.out.println("Enter the dimensions of Triangle");
        a = sc.nextDouble();
        b = sc.nextDouble();
        Triangle t = new Triangle(a, b);

        System.out.println("Enter the radius of Circle");
        a = sc.nextDouble();
        Circle c = new Circle(a);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
