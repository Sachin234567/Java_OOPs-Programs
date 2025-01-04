// Constructor chaining within the same class using this() keyword
public class ConsChain {
    //default constructor 
    ConsChain(){
        //Invoke parameterized constructor
        this("coding ninjas");
        System.out.println("Default constructor called");
    }
    //Parameterized constructor
ConsChain(String s){
    System.out.println("Parameterized constructor called");
}
public static void main(String args[]){
    //Invoke default constructor
    ConsChain obj = new ConsChain();
}
}
