public class Student_Details {
    public static void main(String args[]){
        Stud obj = new Stud();
        //setting the values of variables
        obj.setsdtname("Rahul");
        obj.setsdtrollno(101);
        obj.setsdtage(22);
        //printing the values of the variables 
        System.out.println("Student Name"+obj.getsdtname());
        System.out.println("Student Roll:"+obj.getsdtrollno());
        System.out.println("Student Age:"+obj.getsdtage());
    }
    
}


