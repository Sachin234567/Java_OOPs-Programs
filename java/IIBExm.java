//Instance initialization block with parent class
class Delta{
    Delta(){
        System.out.println("Parent class default constructor");
    }
    //parent class instance initialization block
    {
        System.out.println("parent class instance initialization block");
    }
}
public class IIBExm extends Delta {
    IIBExm(){
        super();
        System.out.println("Child class default constructor");
    }
    //child class instance initialization block
    {
        System.out.println("child class instance initialization block");
    }
    public static void main(String args[]){
        IIBExm obj = new IIBExm();
    }
}
