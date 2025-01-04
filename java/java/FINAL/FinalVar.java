public class FinalVar {

    // Final variable
    final int val=50;
    void show(){
        //Trying to change the value of  the final variable 'val'
        val = 100;  
        System.out.println(val);
    }
    public static void main(String[] args) {
        FinalVar obj = new FinalVar();
        obj.show();
    }
}