class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = {-1, -1};

        for (int i = 0; i < nums.length - 1; i++) {

            int start = i + 1;
            int end = nums.length - 1;
            int find = target - nums[i];

            while (start <= end) {

                int mid = (start + end) / 2;

                if (nums[mid] == find) {
                    arr[0] = i + 1;
                    arr[1] = mid + 1;
                    return arr;
                }

                if (nums[mid] < find) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return arr;
    }
}