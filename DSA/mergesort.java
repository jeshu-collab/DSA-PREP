public class mergesort{
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 9};
        System.out.println("Before sorting: " + java.util.Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + java.util.Arrays.toString(arr));
    }

    static void mergeSort(int[] arr,int low,int high){
        int mid = low + (high - low) / 2;
        if(low>=high){
            return;
        }
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k] = arr[left];
                left++;
                k++;
            }else{
                temp[k] = arr[right];
                right++;
                k++;
            }
        }
        while(left<=mid){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right<=high){
            temp[k] = arr[right];
            right++;
            k++;
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i] = temp[i];
        }
    }
}