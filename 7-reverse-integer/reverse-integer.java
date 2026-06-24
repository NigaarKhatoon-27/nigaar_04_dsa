class Solution {
    public int reverse(int x) {
        int rev=0;
        int n =x;
        if(x<0){

            x=Math.abs(x);
            while(x>0){
                int d= x % 10;
                if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && d>7)) return 0;
            
            rev = rev*10+d;
            x=x/10;
            }
            return -1 * rev;
            
        }

        
        
        else{
        while(x>0){
            int d= x % 10;
               if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && d>7)) return 0;
            
            rev = rev*10+d;
            x=x/10;
            
        }
        return rev;
        }
    }
}