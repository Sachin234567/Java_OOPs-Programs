//CONSTRUCTOR CHAINING TO ANOTHER CLASS USING THE SUPER() KEYWORD
class Person{
    //default constructor
    Person(){
        //invoke current class constructor
        this(10,20);
        System.out.println("Person class default constructor callled");
    }
    //Person class Parameterized Constructor
    Person(int a , int b){
        System.out.println("Person class parameterized constructor called");
   }
    
}
class Student extends Person{
    //default constructor
    Student(){
        //Invoke Current class constructor
        this("Coding", "Ninjas");
        System.out.println("Student class default constructor called");
    }
    //Parameterized constructor
    Student(String str1,String str2){
        //Invoke parant class constructor
        super();
        System.out.println("Student class Parameterized constructor called");
        System.out.println(str1 + " "+str2);

    }

}
public class Test1 {
    public static void main(String a[]){
        //Invoking the default constructor of the Student class
        Student obj = new Student();
    }
}
