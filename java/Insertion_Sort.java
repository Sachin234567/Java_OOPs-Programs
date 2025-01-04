public class Insertion_Sort {
    public void printarray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // method to sort an array 
    void Sort(int arr[],int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
            }
        }

    }
    public static void main(String args[]){
        int arr[]={ 23,41,11,21,18,14,26};
        int n=arr.length;
        Insertion_Sort obj = new Insertion_Sort();
        System.out.println("Before sorting");
        obj.printarray(arr, n);
        obj.Sort(arr, n);
        System.out.println("After sorting");
        obj.printarray(arr, n);

        
    }

    
}
