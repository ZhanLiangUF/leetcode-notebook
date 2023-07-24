public class binaryservice {
    public static void main(String[] args){
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r-l)/2;

            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return -1;
    }
}


// It is important to note that we are using right - left to ensure that there are no way to overflow the memory in the stack. 
// If we did max value of 2147483647 + 2147483647 / 2, java will throw stackoveflow error

// Ways to use binary search
// 1. Using binary search to locate the specific service that the front end user is using