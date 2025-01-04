class Person{
    Person(){
        System.out.println("Parent class default constructor");
    }
    //Parent class instance initialization block
    {
        System.out.println("Parent class instance initialization block");
    }
}
public class Test3 extends Person {
    Test3(){
        super();
        System.out.println("child class constructor");
    }
    //child class instance initialization block
    {
        System.out.println("Child class instance initialization block");
    }
    public static void main(String[] args) {
        Test3 obj = new Test3();
    }
    
}
