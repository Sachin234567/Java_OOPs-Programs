public class Bubble_Rotate {

    public static void rotate(int[] arr,int order){

        if(arr==null || arr.length==0 || order<0){
            throw new IllegalArgumentException("Illegal argument!");

        }
       // throw new IllegalArgumentException("Illegal argument!");
        
        //}
    
        for(int i=0;i<order;i++){
            for(int j=arr.length-1;j>0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp; 
            }
        }
    
    }
    void display(int[] arr,int n){
       // n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Bubble_Rotate Bt = new Bubble_Rotate();
        int[] arr = {0,1,2,3,4,5,6};
        Bt.rotate(arr, 3);
        Bt.display(arr, 7);
    }
}