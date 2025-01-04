public class Stud {
    // private data members
    private int sdtrollno;
    private String sdtname;
    private int sdtage;

    // getter method for student name to access private variable sdtname
    public String getsdtname() {
        return sdtname;
    }

    // setter method for student name to provide the name in private variable
    // sdtname
    public void setsdtname(String sdtname) {
        this.sdtname = sdtname;
    }

    // getter method for student rollno to access private variable sdtrollno
    public int getsdtrollno() {
        return sdtrollno;
    }

    // setter method for student roll no to set value in private variable
    // 'sdtrollno'
    public void setsdtrollno(int sdtrollno) {
        this.sdtrollno = sdtrollno;
    }

    // getter method for student age to access private variable 'sdtage'
    public int getsdtage() {
        return sdtage;
    }

    // setter method for student age to set the value in 'sdtage ' variable
    public void setsdtage(int sdtage) {
        this.sdtage = sdtage;
    }
}

