package encapsulation;

class Student {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Age must be greater than 0.");
        }
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        System.out.println("Student age: " + student.getAge());
        student.setAge(-5);
    }
}