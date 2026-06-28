class Solution {
    public int differenceOfSum(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int digitsum = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 9) {
                int a = nums[i];
                int sum1 = 0;
                while (a > 0) {
                    sum1 = sum1 + a % 10;
                    a = a / 10;
                }
                nums[i] = sum1;
            }

            digitsum += nums[i];
        }

        return sum - digitsum;
    }
}