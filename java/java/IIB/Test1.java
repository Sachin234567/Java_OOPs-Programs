public class Test1{
    //instance initialization block
    {
        System.out.println("Instance initialization block");
    }
    //default constructor of the class
    Test1(){
        System.out.println("Default constructor called");
    }
    public static void main(String[] args) {
        Test1 obj = new Test1();
    }
}