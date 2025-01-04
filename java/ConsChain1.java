// constructor chaining to another class using the super() keyword
class Person1{
    //person class default constructor 
    Person1(){
        //Invoke current class constructor2
        this(10,20);
        System.out.println("Person1 class Default constructor called");
    }
    //Person class Parameterized Constructor
    Person1(int a,int b){
        System.out.println("Person1 class Parameterized called");
    }

}
class Tackle extends Person1{
    //Default Constructor
    Tackle(){
        //invoke current class constructor 
        this("coding", "easy");
        System.out.println(" Tackle class Default constructor called");
    }
    //Parameterized constructor
    Tackle(String str1,String str2){
        //invoke parent class default  constructor
        super();
        System.out.println("Tackle class parameterized called");
    }
}
public class ConsChain1 {
    public static void main(String args[]){
        Tackle obj = new Tackle();


    }
    
}
