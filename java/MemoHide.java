class Parent {
    public static void Display(){
        System.out.println("Inside Parent Class");
    }
}
class Child extends Parent{
    public static void Display(){
        System.out.println("Inside Child class");
    }
}
public class MemoHide {
    public static void main(String args[]){
        Parent P = new Parent();
        P.Display();
        Parent C = new Child();
        C.Display();
    }
}
