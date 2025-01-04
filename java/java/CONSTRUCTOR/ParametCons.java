public class ParametCons {
    // data member
    String str;
    //Parameterized constructor
    ParametCons(String s){
        str=s;
    }
    public void show(){
        System.out.println(str);
    }
    public static void main(String[] args) {
        //Invoking parameterized constructor
        ParametCons obj = new ParametCons("Hello");
        obj.show();
    }
    
}
