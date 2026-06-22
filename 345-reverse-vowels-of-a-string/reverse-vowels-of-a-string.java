class Solution {
    public String reverseVowels(String s) {
        char[] sb = s.toCharArray();

        int i = 0;
        int j = sb.length - 1;

        while (i < j) {

            while (i < j && !"aeiouAEIOU".contains(String.valueOf(sb[i]))) {
                i++;
            }

            while (i < j && !"aeiouAEIOU".contains(String.valueOf(sb[j]))) {
                j--;
            }

            char temp = sb[i];
            sb[i] = sb[j];
            sb[j] = temp;

            i++;
            j--;
        }

        return new String(sb);
    }
}