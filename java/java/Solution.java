public class Solution{
    public static void increase(int x,int y){
        x++;
        y=y+2;
        System.out.println(x+":"+y);
    }
    public static void main(String args[]){
        int a=20;
        int b=10;
        increase(a, b);
        // a and b are actual parameters
        System.out.println(a+":"+b);
    }
}