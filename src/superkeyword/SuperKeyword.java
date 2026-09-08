package super_keyword;

class Parent {

    int x = 10;
}

class Child extends Parent {

    int x = 20;

    void show() {

        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Child child = new Child();

        child.show();
    }
}
