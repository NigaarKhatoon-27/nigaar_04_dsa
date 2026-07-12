class Solution {
    public static void reverse(int[] arr , int start , int end){
        if(start>end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,start+1,end-1);
    } 
    public void reverseArray(int arr[]) {
        // code here
        reverse(arr , 0 , arr.length-1); 
        
    }
}