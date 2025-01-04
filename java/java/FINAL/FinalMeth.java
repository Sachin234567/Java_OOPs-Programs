class Hello {
    //final method 
    final void show(){
        System.out.println("Inside Hello class Method");
    }
}

public class FinalMeth extends Hello{
    //Trying to override the final method ,'show'
    void show(){
        System.out.println("inside FinalMeth class Method");
    }
    public static void main(String[] args) {
        FinalMeth obj = new FinalMeth();
        obj.show();
    }
    
}
