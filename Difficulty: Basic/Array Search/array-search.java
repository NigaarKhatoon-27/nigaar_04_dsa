class Solution {
    public int search(int arr[], int x) {
        // code here
        boolean found = false;
        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                found = true;
                idx = i;
                break;
            }
        }
        if(found == true) return idx;
        return idx;
    }
}
