class Solution {
    public int subtractProductAndSum(int n) {
//456
        int sum=0;
        int product=1;
         while(n>0){
            int c=n%10;
            sum=sum+c;
            product=product*c;
         n=n/10;
         }
        int s= product-sum;
        return s;
    }
}