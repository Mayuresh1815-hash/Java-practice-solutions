// class Solution {
//     public int maximumProduct(int[] nums) {
//         Arrays.sort(nums);
//         int product1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
//         int product2=nums[0]*nums[1]*nums[nums.length-1];
//         return Math.max(product1,product2);
//     }
// }
class Solution {
    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // largest 3
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // smallest 2
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3,
                        min1 * min2 * max1);
    }
}