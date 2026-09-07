package constructors;

class Student {
    String name;
    int age;

    Student() {
        name = "Kanishk";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.display();
    }
}
