class Employee{
    //Data members
    String name;
    int emp_id;
    int sal;
    //constructor with one argument
    Employee(int id){
        emp_id=id;
    }
    //constructor with two argument
    Employee(int id ,String s){
        emp_id = id;
        name=s;
    }
    Employee(int salary,int id,String s){
        sal=salary;
        emp_id=id;
        name=s;
    }
    //Method to display Employee details
    public void show(){
        System.out.println(emp_id+" "+name+" "+sal);
    }

}

public class ConsOverLoad {
    public static void main(String[] args) {
        //passinig the values in the constructor
        Employee obj = new Employee(3);
        Employee obj2 = new Employee(4,"Sachin");
        Employee obj3 = new Employee(5,40000,"Shiv");
        obj.show();
        obj2.show();
        obj3.show();
        
    }    
}
