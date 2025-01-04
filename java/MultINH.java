class Tree{
    public void Large(){
        System.out.println("Growing");
    }
}
class Fruits extends Tree{
    public void Health(){
        System.out.println("Healthy");
    }
}
class Mango extends Fruits {
    public void Sweet(){
        System.out.println("Delicious");
    }
}
public class MultINH{
    public static void main(String args[]){
        // creating obj of the child class
        //Mango obj = new Mango();
        Fruits obj = new Fruits();
        obj.Large();
        obj.Health();
        obj.Sweet();
    }

}