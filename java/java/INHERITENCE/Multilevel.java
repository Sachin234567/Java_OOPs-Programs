class Tree{
    public void large(){
        System.out.println("The tree is large");
    }
}
class Fruits extends Tree{
    public void sweet(){
        System.out.println("The Fruits are sweet");
    }
}
class Mangoes extends Fruits{
    public void green(){
        System.out.println("the mangoes are green from outside");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Mangoes obj = new Mangoes();
        obj.large();
        obj.sweet();
        obj.green();
    }
    
}
