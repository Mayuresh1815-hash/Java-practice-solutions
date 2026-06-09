//  public Static void main(String []args){
//     Scanner sc =new Scanner(System.in);
//     int x=sc.nextInt();
//     int num=0;
//     while(true){
//     x=x%10;
//     num=num*10+x;
//     num++;

//     }
//    return num;

//  }
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (rev > Integer.MAX_VALUE / 10 || 
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}