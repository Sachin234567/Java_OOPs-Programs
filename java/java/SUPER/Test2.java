//Invoking method of the immediate parent class
//base class person
class Person{
    void message(){
        System.out.println("This is base class method");
    }
}
//subclass 'Student'
class Student extends Person{
    void message(){
        System.out.println("This is subclass method");
    }
    //Note that display() is only in 'Student' class
    void display(){
        //This will invoke or call Current class message() method
        message();
        //this will invoke parent class message() method
        super.message();
    }
}
public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        //calling display() method of Student class
        s.display();
    }
}
