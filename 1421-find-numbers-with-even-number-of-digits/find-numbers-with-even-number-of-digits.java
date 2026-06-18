class Solution {

    public int findNumbers(int[] nums) {
        return numbers(nums);
    }

    int numbers(int[] nums) {
        int count = 0;

        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }

        return count;
    }

    boolean even(int digit) {
        return numdigit(digit) % 2 == 0;
    }

    int numdigit(int digit) {
        int count = 0;

        while(digit > 0) {
            count++;
            digit = digit / 10;
        }

        return count;
    }
}