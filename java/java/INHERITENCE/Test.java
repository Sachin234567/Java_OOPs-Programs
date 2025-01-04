class Base{
    public void show(){
        System.out.println("Base class method");
    }
}
class Derived extends Base{
    public void show(){
        System.out.println("Derived class method");
    }
}
public class Test {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.show();
    }
}
