class Solution {
    public int[] leftRightDifference(int[] nums) {

        int[] leftarr = new int[nums.length];
        int[] rightarr = new int[nums.length];
        int[] ans = new int[nums.length];
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            leftarr[i] = sum1;
            sum1 = sum1 + nums[i];
        }
        int sum2 = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            rightarr[j] = sum2;
            sum2 = sum2 + nums[j];
        }

        for (int k = 0; k < nums.length; k++) {
            ans[k] = Math.abs(leftarr[k] - rightarr[k]);
        }
        return ans;
    }
}