class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("Meowing");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.eat();
     //   obj.bark();
        obj.meow();
    }
}
