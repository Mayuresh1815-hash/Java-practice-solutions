class Solution {
    public int[] productExceptSelf(int[] nums) {
         int []left=new int[nums.length];
        int []right=new int[nums.length];
        int product1=1;
        for (int i = 0; i < nums.length; i++) {
            left[i]=product1;
                   product1 =product1*nums[i];
        }
        int product2=1;
        for (int j = nums.length-1; j >=0; j--) {
            right[j]=product2;
                   product2 =product2*nums[j];
        }

        for (int i = 0; i < nums.length ; i++) {
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}