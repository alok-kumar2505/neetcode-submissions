class Solution {

    public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
            for(String str:strs){
                st.append(str);
                st.append("#");
            }
            return st.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        String word=new String();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='#'){
                ans.add(word);
                word="";
                continue;
            }
            word+=ch;
        }
        return ans;

    }
}
