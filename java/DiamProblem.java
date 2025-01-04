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
public class DiamProblem extends A,B{
    public static void main(String args[]){
        DiamProblem obj = new DiamProblem();
        obj.display();
    }
}