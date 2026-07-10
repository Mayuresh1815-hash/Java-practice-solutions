class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        while (n >= a) {
            n = n - a;
            a--;
        }
        return a % 2 != 0;
    }
}