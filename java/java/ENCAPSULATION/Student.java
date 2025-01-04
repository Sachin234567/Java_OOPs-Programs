public  class Student{
    //private data members
    private int Stud_roll;
    private String Stud_Name;
    private int Stud_Age;
    //Getter method for student name to access private variable 'Stud_Name'
    public String getStud_Name(){
        return Stud_Name;
    }
    //setter method for student name to set the value in private variable 'Stud_Name'
    public void setStud_Name(String S){
        this.Stud_Name=S;
    }
    //getter method for student roll no to access private variable 'Stud_roll'
    public int getStud_roll(){
        return Stud_roll;
    }
    //setter method for student roll to set the value in private variable 'Stud_roll'
    public void setStud_roll(int S_Rn){
        this.Stud_roll = S_Rn;
    }
    //getter method for student age to access private variable 'Stud_Age'
    public int getStud_Age(){
        return Stud_Age;
    }
    //setter method for student age to set value in private variable 'Stud_Age'
    public void setStud_Age(int age){
        this.Stud_Age = age;
    }

}