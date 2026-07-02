class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        generate(list, new StringBuilder(), 0, 0, n);
        return list;
    }
    private static void generate(ArrayList<String> list, StringBuilder up, int open, int close, int n) {
        if (open == n && close == n) {
            list.add(up.toString());
            return ;
        }
        if (open < n) {
            up.append('(');
            generate(list, up, open + 1, close, n);
            up.deleteCharAt(up.length() - 1);
        }
        if (close < open) {
            up.append(')');
            generate(list, up, open, close + 1, n);
            up.deleteCharAt(up.length() - 1);
        }
    }
}