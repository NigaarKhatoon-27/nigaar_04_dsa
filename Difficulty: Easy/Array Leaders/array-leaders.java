class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int maxRight = arr[arr.length-1];
        list.add(maxRight);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] >= maxRight){
                list.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
