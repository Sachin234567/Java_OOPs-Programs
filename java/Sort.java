/* low -->starting index,high --> ending index */
class Sort {
    /*
     * this function takes last element as pivot , places the pivot element at its
     * correct position in sorted array ,and places all smaller (smaller than pivot)
     * to the left of pivot and all greater elements to right of pivot
     */
    int Partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = (high - 1); // index of smaller elemlent
        for (int j = low; j < high; j++) {
            // if current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i]and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high](or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // the main function that implements Quicksort
    void Main(int arr[], int low, int high) {
        /* pi is the partition index ,arr[pi] is now at right place */
        int pi = Partition(arr, low, high);
        // Reccursively sort elements before partition and after partition
        Main(arr, low, pi - 1);
        Main(arr, pi + 1, high);
    }
    
    void Printarray(int arr[], int n) {
        //int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

// driver program
    public static void main(String args[]){
        int arr[]={10,7,8,5,3,14,4};
        int n= arr.length;
        Sort obj = new Sort();
        obj.Main(arr,0, 6);
        System.out.println("sorted array");
        obj.Printarray(arr,n);
    }
}

