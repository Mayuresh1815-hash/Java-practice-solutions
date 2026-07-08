class Solution {
    public int findClosest(int x, int y, int z) {
        int a = x - z;
        int b = y - z;

        if (a < 0)
            a = a * -1;
        if (b < 0)
            b = b * -1;
        if (a > b)
            return 2;
        if (a < b)
            return 1;
        else
            return 0;

    }
}