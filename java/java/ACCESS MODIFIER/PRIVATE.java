class PrivateExample{
    // private data member
    private int val=10;
    //private method 
    private void show(){
        System.out.println(val);
    }
}
public class PRIVATE {

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        // Trying to access the private variable
        obj.val += 10;
        //trying to access the method
        obj.show();
    }
}