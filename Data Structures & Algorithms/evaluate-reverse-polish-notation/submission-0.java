class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b=st.peek();
                int a=st.peek();
                if(s.equals("+")){
                    st.push(a+b);
                }else if(s.equals("-")){
                    st.push(a-b);
                }else if(s.equals("*")){
                    st.push(a*b);
                }else{
                    st.push(a/b);
                }
                
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
            // System.out.print(val);
        }
        return st.peek();
        
    }
}
