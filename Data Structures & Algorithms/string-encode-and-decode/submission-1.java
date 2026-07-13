class Solution {

    public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
            for(String str:strs){
                int n=str.length();
                st.append(n);
                st.append("#");
                st.append(str);
                
            }
            return st.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();

        int i=0; //at digit
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            StringBuilder sb=new StringBuilder();
            sb.append(str.substring(j+1,j+1+len));
            ans.add(sb.toString());

            i=j+1+len;


        }        
        return ans;

    }
}
