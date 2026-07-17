class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;

        int i=0;
        int j=n-1;

        int max=-1;
        // int area=0;
        while(i<j){
            if(heights[i]<=heights[j]){
                int area=heights[i]*(j-i);
                // System.out.print(area+",");
                max=Math.max(max,area);
                i++;
            }else{
                int area=heights[j]*(j-i);
                max=Math.max(max,area);
                j--;
            }
        }
        return max;
        
    }
}
