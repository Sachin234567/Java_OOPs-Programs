class A{
    public void display(){
        System.out.println("In class A");
    }
}
class B extends A{
    public void display(){
        System.out.println("In class B");
    }
}
class C extends A,B{
    public void display(){
        System.out.println("In class C");
    }
}
public class DiamondProb{
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
