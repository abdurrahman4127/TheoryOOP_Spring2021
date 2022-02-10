package InHomeAssignment_01;

class Shape {}
class Rectangle extends Shape {}
class Circle extends Shape {}
class Triangle extends Shape {}


public class Casting {
    public static void main(String[] args) {
        Shape r = new Rectangle(); // Works
        Shape c = new Circle(); // Works
//        Rectangle rect = new Circle(); // Will never compile, because it just doesn't make sense
        Rectangle rectangle = (Rectangle) c;// Will fail at runtime, because c is not a rectangle.

    }
}


