class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int original=x;
    int div=0;
    while(x>0){
     int s=x%10;
     div=div+s;
        x/=10;
    }
        if(original%div==0){
            return div;
        }
        return -1;
    }
}