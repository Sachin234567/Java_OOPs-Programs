public class ThisCons {
    
    // Invoking the constructor of the current class
    int a;
    int b;

    // Default constructor
    ThisCons(){
        this(10,20);
        System.out.println("Inside the default constructor");

    }

    // parameterized constructor
    ThisCons(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Inside the parameterized constructor");
    }

    public static void main(String args[]) {
        ThisCons obj = new ThisCons();
    }
    
}
