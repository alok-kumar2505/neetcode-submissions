class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        int n=s.length();
        if(n<t.length()) return "";

        for(char ch:t.toCharArray()){
            freq[ch]++;
        }

        int l=0;
        int r=0;
        int cnt=t.length();
        int minLength=Integer.MAX_VALUE;
        int start=0; //to track min string starting
        while(r<n){
            char ch=s.charAt(r);

            if(freq[ch]>0){
                cnt--;
            }
            freq[ch]--;
            r++;
            while(cnt==0){
                if(r-l<minLength){
                    minLength=r-l;
                    start=l;
                }
                freq[s.charAt(l)]++;

                if(freq[s.charAt(l)]>0){
                    cnt++;
                }
                l++;

            }
        }

        return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);

    }
}
