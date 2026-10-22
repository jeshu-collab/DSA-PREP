class upperbound {
    public int[] searchRange(int[] nums, int target) {
        int a = lowerbound(nums,target);
        if(a == nums.length() || nums[a] =! target)
        int b = upperbound(nums,target);
        int[] answer = {a,b-1};
        return answer;
    }

    static int lowerbound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperbound(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        return ans;
        
    }
}