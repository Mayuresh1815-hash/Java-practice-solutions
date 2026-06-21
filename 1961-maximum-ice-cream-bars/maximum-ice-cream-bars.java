class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count = 0;
        int sum = 0;

        for (int i : costs) {
            if (sum + i <= coins) {
                sum += i;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}