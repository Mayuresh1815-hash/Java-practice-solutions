class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even = n * (n + 1);
        int odd = n * n;
        int big = 1;
        for (int i = 1; i <= Math.min(even, odd); i++) {
            if (odd % i == 0 && even % i == 0) {
                big = Math.max(big, i);
            }
        }
        return big;
    }
}