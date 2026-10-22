public class Main{
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    
    }

    static void bubble(int[] arr){

        boolean swapped;
        //run a loop for n-1 times
        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            //run each step, max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence break the loop
            if(!swapped){
                break;
            }
        }
    }
}