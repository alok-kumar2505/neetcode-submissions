class MinStack {
    Stack <Integer> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
         return st.peek();
    }
    
    public int getMin() {
        Stack <Integer> st1=new Stack<>();
        int min=Integer.MAX_VALUE;
        while(!st.isEmpty()){
            int val=st.pop();
            if(val<min){
                min=val;
            }
            st1.push(val);
        }
        while(!st1.isEmpty()){
            int val=st1.pop();
            st.push(val);
        }
        return min;
    }
}
