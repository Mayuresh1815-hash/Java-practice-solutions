class Solution {
    public int largestAltitude(int[] gain) {

        ArrayList<Integer> list = new ArrayList<>();

        int altitude = 0;
        list.add(0);

        for(int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            list.add(altitude);
        }

        int max = Collections.max(list);
        return max;
    }
}