//Invoking constructor of immediate parent class
//base class 'Person'
class Person {
    // Default constructor
    Person() {
        System.out.println("Inside Parent class constructor");
    }

}

// child class 'Student '
class Student extends Person {
    // default constructor
    Student() {

        // Invoking or call parent class constructor
        super();
        System.out.println("Inside child class constructor");

    }
}

public class Test3 {
    public static void main(String[] args) {
        Student s = new Student();

    }
}
