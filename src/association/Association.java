package association;

class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student student) {
        System.out.println(name + " is teaching " + student.name);
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Association {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma");
        Student student = new Student("Kanishk");

        teacher.teach(student);
    }
}