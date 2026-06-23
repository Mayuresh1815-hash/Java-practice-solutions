// class Solution {
//     public int reverse(int x) {
//         int rev = 0;

//         while (x != 0) {
//             int digit = x % 10;
//             x = x / 10;

//             if (rev > Integer.MAX_VALUE / 10 || 
//                 rev < Integer.MIN_VALUE / 10) {
//                 return 0;
//             }

//             rev = rev * 10 + digit;
//         }

//         return rev;
//     }
// }
class Solution {
    public int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int digit = x % 10;
                        rev = rev * 10 + digit;
            if (rev > Integer.MAX_VALUE ||rev < Integer.MIN_VALUE ) 
                return 0;
            
            x=x/10;

        }

        return (int)rev;
    }
}
