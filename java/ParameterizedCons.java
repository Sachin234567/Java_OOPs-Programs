public class ParameterizedCons {
    //data member
    //String str;
    //parameterized constructor
    ParameterizedCons(String s){
        System.out.println(s);
       // str=s;

    }
    /*public void show(){
        System.out.println(str);
    }*/
    public static void main(String args[]){
        //this would invoke parameterized constructor
        ParameterizedCons obj = new ParameterizedCons("Sachin Gurjar");
        //obj.show();
    }
    
}
