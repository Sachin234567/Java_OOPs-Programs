//parent class
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}
// child class
class Dog extends Animal{
    public void Bark(){
        System.out.println("Barking");
    }
}

public class SingleINH {
    public static void main(String args[]){
        // creating an object of the child class
        Dog obj = new Dog();
        // calling methods
        obj.eat();
        obj.Bark();
    }    
}
