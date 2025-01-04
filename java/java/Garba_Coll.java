public class Garba_Coll {
    public static void main(String args[]) {
        Garba_Coll t1=new Garba_Coll();
        Garba_Coll t2=new Garba_Coll();
        //nullifying the reference variable
        t1=null;
        //requesting jvm for running garbage collector
        System.gc();
        //nullifying the reference variable
        t2=null;
        //requesting jvm for running garbage collector
        Runtime.getRuntime().gc();

    }
    @Override
    //finally method is called an object once before garbage collecting it
    protected void finalize() throws Throwable{
        System.out.println("Garbage collector called");
        System.out.println("Object Garbage Collected:"+this);
    }
    
}
