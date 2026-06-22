class Solution {
    public void reverseString(char[] s) {
         swap(s,0,s.length-1);
    }

    void swap(char[] s,int i,  int j){
        
        if(i>=j){
            return;
        }
            char temp =s[i];
                s[i]=s[j];
                s[j]=temp;
               swap(s,i+1,j-1);

        }

    }
