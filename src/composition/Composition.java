package composition;
class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}
class Car {
    private Engine engine;
    Car() {
        engine = new Engine();
    }
    void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}
public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}