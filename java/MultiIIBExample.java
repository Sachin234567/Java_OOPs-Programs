public class MultiIIBExample {
    //Instance initialization block1
    {
        System.out.println("Instance initialization block 1");
    }
    //Instance initialization block2
    {
        System.out.println("Instance initialization block 2");
    }
    //Default constructor of class
    MultiIIBExample(){
        System.out.println("Default constructor called");
    }
    //Instance initialization block3
    {
        System.out.println("Instance initialization block 3");

    }
    //Instance initialization block4
    {
        System.out.println("Instance initialization block 4");
    }
    public static void main(String args[]){
        MultiIIBExample obj = new MultiIIBExample();
    }
}
