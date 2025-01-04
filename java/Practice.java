class Base{
    public void Show(){
        System.out.println("base class Show() method");
    }
}
class Derived extends Base{
    public void Show(){
        System.out.println("Derived class Show() method ");
    }
}
public class Practice{
    public static void main(String args[]){
        Base b=new Derived();//Dynamic method dispatch logic
        b.Show();
    }
}