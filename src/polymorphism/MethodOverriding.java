package polymorphism;

class Animal {

    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sound();

        Cat cat = new Cat();
        cat.sound();

        // Runtime polymorphism
        Animal animal2 = new Cat();
        animal2.sound();
    }
}
