class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
       int i=0;
       int j=str.length()-1;

       while(i<j){
        char st=str.charAt(i);
        char end=str.charAt(j);
        if(st!=end){
            return false;
        }
        i++;
        j--;
       }

        return true;
        
    }
}
