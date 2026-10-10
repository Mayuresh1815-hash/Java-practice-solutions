class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftp = new int[nums.length];
        int[] rightp = new int[nums.length];
        int product1 = 1;
        for (int i = 0; i < nums.length; i++) {
            leftp[i] = product1;
            product1 = product1 * nums[i];
        }

        int product2 = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            rightp[j] = product2;
            product2 = product2 * nums[j];
        }

        for (int k = 0; k < nums.length; k++) {
            nums[k] = leftp[k] * rightp[k];
        }
        return nums;

    }
}