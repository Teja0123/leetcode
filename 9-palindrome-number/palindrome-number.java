class Solution {
    public boolean isPalindrome(int x)
    {
        int s=0;
        int o=x;
       while(x>0)
       {
        int t=x%10;
        s=t+s*10;
        x/=10;

       }
       if(s==o)
       return true;
       else
       return false;
        
    }
}