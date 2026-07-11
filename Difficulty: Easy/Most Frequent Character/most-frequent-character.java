class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i) , 1);
            }
        }
        int max = 0;
        char ans = 'a';
        for( char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                ans = key;
            }
            else if(map.get(key) == max && key < ans){
                ans = key;
            }
        }
        return ans;
    }
}