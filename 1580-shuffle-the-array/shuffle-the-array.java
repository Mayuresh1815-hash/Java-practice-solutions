class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr=new int [n*2];
            int x=0;
            int y=n;
        for(int i=0;i<nums.length;i+=2){
            arr[i]=nums[x];
            arr[i+1]=nums[y];
            x++;
            y++;
        } 
        return arr;
    }
}