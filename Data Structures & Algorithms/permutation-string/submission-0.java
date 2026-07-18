class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int m=s1.length();
        int n=s2.length();
        if(m>n) return false;
        char[] str1=s1.toCharArray();
        Arrays.sort(str1);
        String st=new String(str1);

        for(int i=0;i<=s2.length()-m;i++){
            String sub=s2.substring(i,i+m);
            char[] subChar=sub.toCharArray();
            Arrays.sort(subChar);
            String str=new String(subChar);

            if(st.equals(str)) return true;

        }
        return false;
        
    }
}
