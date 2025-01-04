//Constructor chaining within the same class using this() keyword
public class Student1{
    //default constructor
    Student1(){
        //invoke parametrized constructor
        this("Coding Ninjas");
        System.out.println("Default constructor called");
    }
    //parametrized constructor
    Student1(String str){
        System.out.println("Parametrized constructor called");
    }
    public static void main(String[] args) {
        //invoke default constructor
        Student1 obj = new Student1();
        
    }

}