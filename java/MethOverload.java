/*class SuperCla{
    // method with two parameters
    public int mult(int a,int b){
        return a*b;
    }
    // Method with three parameters
    public int mult(int a,int b,int c){
        return a*b*c;
    }

}
public class MethOverload {
    public static void main(String args[]){
        SuperCla obj = new SuperCla();
        // Method calling by passing arguments
        int Ptwo = obj.mult(10, 20);
        int pthree = obj.mult(10,20,30);
        System.out.println(Ptwo);
        System.out.println(pthree);
    }
}
*/
class BaseCla{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class MethOverload{
    public static void main(String args[]){
        BaseCla obj = new BaseCla();
        int x=obj.add(10,20);
        double y=obj.add(10.5,25.5);
        System.out.println(x);
        System.out.println(y);

    }
}