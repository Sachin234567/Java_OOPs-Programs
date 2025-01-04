//Multiple instance initialization block
public class Test2 {
    //Instance initialization block1
    {
        System.out.println("Instance Initialization block1");
    }
    //Instance Initialization Block2
    {
        System.out.println("Instance Initialization block2");
    }
    //Instance Initialization Block3
    {
        System.out.println("Instance Initialization Block3");
    }
    //Default Constructor of class
    Test2(){
        System.out.println("Default Constructor Called");
    }
    //Instance Initialization block4
    {
        System.out.println("Instance Initialization block4");
    }
    public static void main(String[] args) {
        Test2 obj = new Test2();
    }
}
