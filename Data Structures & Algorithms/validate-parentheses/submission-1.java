class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        if(s.length()<=1) return false;
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && (ch==')' || ch=='}' || ch==']')){
                if((st.peek()=='(' && ch==')') || 
                    (st.peek()=='{' && ch=='}') ||
                     (st.peek()=='[' && ch==']')){
                    st.pop();
                }else{
                    return false;
                }
                continue;
            }
            st.push(ch);
        }
         return true;
        
    }
}
