//Base class 
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}
//child class
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking ");
    }
    
}
public class Single{
    public static void main(String args[]){
    Dog  obj = new Dog();
        //calling methods 
        obj.bark();
        obj.eat();
    }
}