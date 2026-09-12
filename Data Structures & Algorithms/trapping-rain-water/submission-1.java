class Solution {

    private int[] rmax(int[] arr){
        int n=arr.length;
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],arr[i]);
        }
        return rmax;
        
    }
    private int[] leftMax(int[] arr){
        int n=arr.length;
        int[] leftMax=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        return leftMax;
    }
    public int trap(int[] height) {
        int[] rmax=rmax(height);
        int[] leftMax=leftMax(height);
        int n=height.length;

        int area=0;
        for(int i=0;i<n;i++){
            area+=Math.min(leftMax[i],rmax[i])-height[i];
        }

        

        return area;
    }
}
