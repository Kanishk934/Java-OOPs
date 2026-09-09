package abstraction;

abstract class Shape {
    abstract void draw();

    void info() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
public class AbstractionClass {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.info();
        circle.draw();
    }
}