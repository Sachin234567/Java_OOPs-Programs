// Invoking the method of the current class
public class ThisMeth {
    public void show(){
        //calling function print() using 'this' keyword
        this.print();
        System.out.println("Inside the show() function");
    }
    public void print(){
        System.out.println("Inside the print() function");
    }
    public static void main(String args[]){
        ThisMeth obj = new ThisMeth();
        obj.show();
    }

    
}
