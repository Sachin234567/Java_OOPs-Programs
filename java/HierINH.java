class School{
    public void Edu(){
        System.out.println("Education");
    }
}
class Teacher extends School{
    public void Teach(){
        System.out.println("Teaching");
    }
}
class Students extends School{
    public  void Study(){
        System.out.println("Studying");
    }
}
public class HierINH {
    public static void main(String[] args){
        Students ob = new Students();
        ob.Study();
        ob.Teach();// Error - the method Teach() is undefined for Students class
        ob.Edu();
    }
    
}
