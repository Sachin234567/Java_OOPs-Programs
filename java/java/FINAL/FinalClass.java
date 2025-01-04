//final class
final class Hello1 {
    void show(){
        System.out.println("Inside Hello1 class method");
    }
}
//trying to extend the final class 'Hello1'
public class FinalClass extends Hello1 {
    void show(){
        System.out.println("Inside FinalClass class method");
    }
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();

    }
    
}
