//Base class 'Person'
class Tenda{
    void message(){
        System.out.println("This is base class Method ");
    }
}
//subclass 'Student'
class Honda extends Tenda{
    void message(){
        System.out.println("This is subclass method");
    }
    //note that display( ) method is only in subclass
    void display(){
        //this will invoke the current class message() method
        message();
        //this will invoke the parent class message() method
        super.message();

    }
}
public class SuperMeth{
    public static void main(String args[]){
        Honda obj = new Honda();
        obj.display();
    }
}