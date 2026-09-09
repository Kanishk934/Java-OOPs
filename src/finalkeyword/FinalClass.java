package final_keyword;

final class Vehicle {

    void display() {
        System.out.println("This is a vehicle.");
    }
}

// This would cause an error:
// class Car extends Vehicle { }

public class FinalClass {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.display();
    }
}