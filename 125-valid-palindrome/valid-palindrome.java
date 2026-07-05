class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] arr1 = s.toCharArray();
        int i = 0;
        int j = arr1.length - 1;
        while (j > i) {
            char temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }
        String str = String.valueOf(arr1);

        return s.equals(str);
    }
}