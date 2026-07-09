class Solution {
    public int pivotInteger(int n) {
        int sum1 = 0;
        int[] arr1 = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sum1 = sum1 + i;
            arr1[i] = sum1;
        }
        int sum2 = 0;
        int[] arr2 = new int[n + 1];

        for (int j = n; j >= 1; j--) {
            sum2 = sum2 + j;
            arr2[j] = sum2;
        }

        for (int k = 1; k <= n; k++) {
            if (arr1[k] == arr2[k])
                return k;
        }

        return -1;
    }
}