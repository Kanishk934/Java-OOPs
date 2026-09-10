package access_modifiers;
class Student {
    private int age = 20;
    int marks = 90;              // default
    protected String name = "Kanishk";
    public String university = "DIT University";
    void display() {
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
        System.out.println("University: " + university);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
