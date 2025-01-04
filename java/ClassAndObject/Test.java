package ClassAndObject;
class Box {
    //Member variable
    double width;
    double height;
    double depth;

}
public class Test {
    public static void main(String args[]){
        //creating an object of box class
        Box obj = new Box();
        // assigning values to obj instance variable
        obj.width=5;
        obj.depth=6;
        obj.height=7;
        //computing the volume of the box 
        double vol=obj.depth*obj.height*obj.width;
        System.out.println("volume of box "+vol);
    }
}
