import java.util.Scanner;

class GFG {
    public static int sum(int i , int n){
        
        if(i> n) return 0;
        
        return i+ sum(i+1 , n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int result=  sum(0 , n);
       System.out.println(result);
        
        

        // code here
        
    }
}