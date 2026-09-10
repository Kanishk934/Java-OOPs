/*("this refers to the current object
The most common use is when a constructor parameter has the same name as an instance variable.
Without this:
name = name;
It's unclear which name you're referring to.
        With this:
        this.name = name;
means:
        this.name → object's instance variable
name     → constructor parameter*/


package this_keyword;
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class ThisKeyword {

    public static void main(String[] args) {

        Student student = new Student("Kanishk", 20);

        student.display();
    }
}
