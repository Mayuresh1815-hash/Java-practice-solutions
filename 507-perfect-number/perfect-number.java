class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                list.add(i);
            }
        }

        int sum = 0;

        for(int j = 0; j < list.size(); j++) {
            sum = sum + list.get(j);
        }

        return sum == num;
    }
}