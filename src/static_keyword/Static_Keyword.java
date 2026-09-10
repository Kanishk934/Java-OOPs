package static_keyword;

class Student {

    String name;

    static String university = "DIT University";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("University: " + university);
    }
}

public class Static_Keyword {

    public static void main(String[] args) {

        Student student1 = new Student("Kanishk");
        Student student2 = new Student("noah");

        student1.display();
        System.out.println();

        student2.display();

        System.out.println();
        System.out.println("Access using class: " + Student.university);
    }
}
