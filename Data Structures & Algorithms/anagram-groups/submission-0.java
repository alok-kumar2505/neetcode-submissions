class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> list=new ArrayList<>();
       boolean[] vis=new boolean[strs.length];

       for(int i=0;i<strs.length;i++){
        String str1=strs[i];
        if(vis[i]){
            continue;
        }
        vis[i]=true;
        List <String> grp=new ArrayList<>();
        grp.add(str1);
        char[] ch=str1.toCharArray();
        Arrays.sort(ch);
        String sorted1=new String(ch);
        for(int j=i+1;j<strs.length;j++){
            String str2=strs[j];
            char[] ch2=str2.toCharArray();
            Arrays.sort(ch2);
            String sorted2=new String(ch2);

            if(vis[j]){
                continue;
            }
            if(sorted1.equals(sorted2)){
                grp.add(str2);
                vis[j]=true;
            }
        }
        list.add(grp);
       } 
       return list;
    }
}
