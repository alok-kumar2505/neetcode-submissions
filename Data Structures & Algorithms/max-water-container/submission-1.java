class Solution {
    public int maxArea(int[] heights) {
        int st=0;
        int end=heights.length-1;
        int max=-1;
        while(st<end){
            if(heights[st]<heights[end]){
                int wid=end-st;
                int area=heights[st]*wid;
                max=Math.max(max,area);
                st++;
            }else{
                int wid=end-st;
                int area=heights[end]*wid;
                max=Math.max(max,area);
                end--;
            }
        }
        return max;
        
    }
}
