class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        generate(list, "", 0, 0, n);
        return list;
    }
    static void generate(ArrayList<String> list, String up, int o, int c, int n) {
        if (o == n && c == n) {
            list.add(up);
            return;
        }
        if (o < n) generate(list, up + '(', o + 1, c, n);
        if (c < o) generate(list, up + ')', o, c + 1, n);
    }
}