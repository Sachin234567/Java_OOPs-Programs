//REFERING TO THE INSTANCE VARIABLE OF THE IMMIDIATE PARENT CLASS
//Base class 'Vehicle'
class Vehicle {
    int maxspeed=120;

}
//Subclass 
class Splendar extends Vehicle{
    int maxspeed=150;
    void show(){
        //print maxspeed of base class vehicle 
        System.out.println("maximum speeed:"+super.maxspeed);
    }
}
public class Test1 {
    static public void main(String[] args) {
        Splendar obj = new Splendar();
        obj.show();
    }
    
}