public class StaticBlock{
    //static variables
    static int a=10;
    static int b;
    //static block
    static{
        System.out.println("Static Blocked Initialized");
        b=a*4;
    }
    public static void main(String[] args) {
        System.out.println("Inside Maiin method");
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
}