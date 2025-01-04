public class Animal {

    public void rotate(int[] nums, int k){
        if (k>nums.length) {
            k=k%nums.length;
        }
        int[] result = new int[nums.length];
        for(int i=0;i<k;i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k;i<nums.length;i++){
            result[i]=nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
        for(int i=0;i<nums.length;i++){
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args){
       // Animal t1= new Animal();
        int[] arr = { 21,13,31,16,11,27,23};
        Animal t1= new Animal();
        t1.rotate(arr, 3);
    }
}
