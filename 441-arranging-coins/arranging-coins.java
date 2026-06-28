class Solution {
    public int arrangeCoins(int n) {

        int count = n;
        int rows = 0;

        for (int i = 1; i <= n; i++) {
            if (count >= i) {
                count = count - i;
                rows++;
            } else {
                break;
            }
        }

        return rows;
    }
}