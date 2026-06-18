class Solution {
    public double angleClock(int hour, int minutes) {
        int deg1=6;
        int deg2=30;
        double angle=(hour*deg2+ minutes*0.5)-(minutes*deg1);
       angle=Math.abs(angle);

   return Math.min(angle, 360 - angle);

    }
}