package polymorphism;

class Calculator {

    // Two integer parameters
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Three integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    // Two double parameters
    void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(10, 20);
        calculator.add(10, 20, 30);
        calculator.add(10.5, 20.5);
    }
}
