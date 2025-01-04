//Refering to the instance variable of the current class
/*public class ThisKeyExam1 {

    int a;
    int b;
    
    void show() {
        // displaying value of variables a and b
        System.out.println("a=" +a + "b=" +b);
    }

    //parameterized constructor
    ThisKeyExam1(int a , int b){
        this.a=a;
        this.b=b;
        System.out.println("a="+a+"b= "+b);
    }
    
    public static void main(String[] args) {
        ThisKeyExam1 obj = new ThisKeyExam1(10, 20);
        obj.show();
    }
}


//  INVOKING THE CONSTRUCTOR OF THE CURRENT CLASS

public class ThisKeyExam1 {

    int a;
    int b;
    //default constructor
    ThisKeyExam1(){
        this(10,20);
        System.out.println("Inside the Default Constructor");
    }
    //Parameterized constructor
    ThisKeyExam1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);
        System.out.println("Inside parameterized constructor");
       
    }
    
   //  public void show() {
        System.out.println(a + " " + b);
    }//
    
    public static void main(String[] args) {
        ThisKeyExam1 obj  = new ThisKeyExam1();
      //  obj.show();
    }
}
*/

//INVOKING THE METHOD OF THE CURRENT CLASS
public class ThisKeyExam1 {

    public void show(){
        //calling 'display' method using 'this' keyword
        this.display();
        System.out.println("Inside the show() function");
    }
    public void display(){
        System.out.println("Inside th display() method");
    }
    public static void main(String[] args) {
        ThisKeyExam1 obj  = new ThisKeyExam1();
        obj.show();
    }
}