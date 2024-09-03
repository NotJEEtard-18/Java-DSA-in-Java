class Student {
    String name;
    int roll;
    
    Student(String name) {
        this.name = name;
        System.out.println(name);
    }
    Student(int roll) {
        this.roll = roll;
        System.out.println(roll);
    }
    Student() {
        System.out.println("constructor is called...");
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shubham");
        Student s3 = new Student(123);
        // Student s4 = new Student("Shubham", 123);   //error
    }
}
