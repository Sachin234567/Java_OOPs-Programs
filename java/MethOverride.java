class Parent1{
    public void show(){
        System.out.println("Inside parent class");
    }
}
class SubClass1 extends Parent1{
    public void show(){
        System.out.println("Inside Subclass1 class method");
    }

}
class SubClass2 extends Parent1{
    public void show(){
        System.out.println("Inside SubClass2 class method");
    }
}

public class MethOverride {
    public static void main(String args[]){
        Parent1 p1;
        //Upcasting 
        p1 = new SubClass1();
       // Parent1 p1 = new SubClass1();
        p1.show();
       // Parent1 p2 =new SubClass2();
       p1 = new SubClass2();
        p1.show();
    }
    
}
