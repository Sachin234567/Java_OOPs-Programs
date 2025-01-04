class Employee{
    // data members
    String name;
    int employeeId;
    int salary;
    //constructor with one parameter
    Employee(int eid){
        employeeId=eid;
    }
    //constructor with two argument
    Employee(int eid,String s){
        employeeId=eid;
        name=s;
    }
    //constructorr with three argument
    Employee(int eid,int sal,String s){
        employeeId=eid;
        salary=sal;
        name=s;
    }
    //method to display all attributes of employee
    public void display(){
        System.out.println(employeeId+" "+salary+" "+name);
    }
}
public class ConsOverloasind {
    public static void main(String args[]){
        //passing the values in the constructor
        Employee obj1= new Employee(265, 0, null);
        Employee obj2 = new Employee(265, "sachin" );
        Employee obj3 = new Employee(265, 45000, "sachin");
        obj1.display();
        obj2.display();
        obj3.display();
    }

    
}
