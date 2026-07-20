class Solution {
    public int strStr(String haystack, String needle) {

        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();

        if (arr2.length == 0)
            return 0;

        int i = 0;

        while (i <= arr1.length - arr2.length) {

            int j = 0;
            int count = 0;

            while (j < arr2.length && arr1[i + j] == arr2[j]) {
                j++;
                count++;
            }

            if (count == arr2.length)
                return i;

            i++;
        }

        return -1;
    }
}