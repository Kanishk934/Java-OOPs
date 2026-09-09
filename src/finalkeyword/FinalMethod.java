package final_keyword;

class Car {

    final void engineType() {
        System.out.println("Petrol Engine");
    }
}

class SportsCar extends Car {

    // This is NOT allowed:
    // void engineType() {
    //     System.out.println("Electric Engine");
    // }
}

public class FinalMethod {

    public static void main(String[] args) {

        SportsCar car = new SportsCar();

        car.engineType();
    }
}
