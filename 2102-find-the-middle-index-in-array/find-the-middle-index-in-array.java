class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int lsum = 0;
        for (int i = 0; i < n; i++) {
            lsum += nums[i];
            left[i] = lsum;
        }

        int rsum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rsum += nums[i];
            right[i] = rsum;
        }

        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }
}