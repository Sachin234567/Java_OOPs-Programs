public class StudentDeta {
    public static void main(String[] args) {
        Student obj = new Student();
        //setting the values of the variables
        obj.setStud_Name("Rahul");
        obj.setStud_roll(101);
        obj.setStud_Age(22);
        System.out.println("Student Name:"+obj.getStud_Name());
        System.out.println("Student Rollno:"+obj.getStud_Age());
        System.out.println("Student Age:"+obj.getStud_roll());
    }
    
}
