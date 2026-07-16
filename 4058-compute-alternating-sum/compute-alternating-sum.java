class Solution {
    public int alternatingSum(int[] nums) {
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            evensum = evensum + nums[i];
        }
        for (int i = 1; i < nums.length; i = i + 2) {
            oddsum = oddsum + nums[i];
        }
        int ans = evensum - oddsum;
        return ans;
    }
}