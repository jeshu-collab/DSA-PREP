public class Linearsearch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    // search the array: return the index if item found and return -1 if item not
    // found
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;

    }
}