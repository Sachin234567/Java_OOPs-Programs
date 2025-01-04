// parent class 'person'
class Person{
    // Default Constructor
    Person(){
        System.out.println("Parent class constructor");
    }
}
//child class 'student ' extendinig the 'Person' class
class Student extends Person{
    Student(){
        //INvoking parnt class constructor 
        super();
        System.out.println("Child class constructor");
    }
}
public class SuperCons {
    public static void main(String args[]){
        Student s= new Student();
    }
    
}
