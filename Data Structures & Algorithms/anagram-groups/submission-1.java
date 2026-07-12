class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String,List<String>> map=new HashMap<>();

       for(int i=0;i<strs.length;i++){
        String str=strs[i];
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String sorted1=new String(ch);
        
        if(!map.containsKey(sorted1)){
            map.put(sorted1,new ArrayList<>());
        }
        map.get(sorted1).add(str);

       }
       return new ArrayList<>(map.values());
    }
}
