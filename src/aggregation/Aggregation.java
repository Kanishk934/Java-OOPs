package aggregation;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

class Department {

    String departmentName;
    Student student;

    Department(String departmentName, Student student) {
        this.departmentName = departmentName;
        this.student = student;
    }

    void display() {
        System.out.println("Department: " + departmentName);
        System.out.println("Student: " + student.name);
    }
}

public class Aggregation {

    public static void main(String[] args) {

        Student student = new Student("Kanishk");

        Department department =
                new Department("Computer Science", student);

        department.display();
    }
}
