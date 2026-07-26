class Solution {
    static int countDistinct(int arr[]) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        int count = 0;
        
        for(int key : map.keySet()){
            count++;
        }
        return count;
    }
}