class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class BasicClass {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Kanishk";
        student1.age = 20;

        student1.display();
    }
}