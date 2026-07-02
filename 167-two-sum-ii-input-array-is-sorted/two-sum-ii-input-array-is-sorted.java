class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int sum = nums[start] + nums[end];

            if (sum == target) {
                arr[0] = start + 1;
                arr[1] = end + 1;
                return arr;
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }

        return arr;
    }
}