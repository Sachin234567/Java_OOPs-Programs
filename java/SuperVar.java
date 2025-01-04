// base class 'Vehicle'
class Vehicle{
    int maxspeed=120;
}
//subclass 'splender' extending 'Vehicle'
class Splender extends Vehicle{
    int maxspeed = 150;
    void show(){
        //print maxspeed of the base class 'Vehicle'
        System.out.println("Maximum speed:"+super.maxspeed);
    }
}
// Refering of the instance variables of the immediate parent class
public class SuperVar{
    public static void main(String args[]){
        Splender obj = new Splender();
        obj.show();
    }


}