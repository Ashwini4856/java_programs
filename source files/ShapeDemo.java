abstract class Shape {
    int dim1, dim2;

    
    Shape(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    
    abstract void printArea();
}


class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}


class Triangle extends Shape {
    Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}


class Circle extends Shape {
    Circle(int r) {
        super(r, 0); 
    }

    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * dim1 * dim1));
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(10, 5);
        Circle cir = new Circle(7);

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}
