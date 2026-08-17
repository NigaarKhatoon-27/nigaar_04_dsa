class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> str = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!st.isEmpty()) st.pop();
            
            }
            else{
                st.push(s.charAt(i));
            }
        }
         for(int i = 0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(!str.isEmpty()) str.pop();
            
            }
            else{
                str.push(t.charAt(i));
            }
        }
        String n = "";
        for(char ch : st){
            n += ch;
        }
        String a = "";
        for(char ch : str){
            a += ch;
        }
        return n.equals(a);
    }
}