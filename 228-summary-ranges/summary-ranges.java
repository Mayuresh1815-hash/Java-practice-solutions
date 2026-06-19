class Solution {
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> list = new ArrayList<>();

        if(nums.length == 0){
            return list;
        }

        int count = nums[0];

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] + 1 != nums[i + 1]){

                if(count == nums[i]){
                    list.add(String.valueOf(count));
                }else{
                    list.add(count + "->" + nums[i]);
               }
                count = nums[i + 1];
            }
        }
        if(count == nums[nums.length - 1]){
            list.add(String.valueOf(count));
        }else{
            list.add(count + "->" + nums[nums.length - 1]);
        }

        return list;
    }
}