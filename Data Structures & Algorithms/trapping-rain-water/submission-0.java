class Solution {
    public int[] leftMax(int[] arr){
        int n=arr.length;

        int[] preM=new int[n];
        preM[0]=arr[0];
        for(int i=1;i<n;i++){
            preM[i]=Math.max(preM[i-1],arr[i]);
            // System.out.print(preM[i]+",");
        }
        
        return preM;

    }

    public int[] rightMax(int[] arr){
        int[] rightM=new int[arr.length];
        rightM[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightM[i]=Math.max(arr[i],rightM[i+1]);
        }
        return rightM;
    }
    public int trap(int[] height) {
        int[] leftM=leftMax(height);
        int[] rightM=rightMax(height);

        int water=0;

        for(int i=0;i<height.length;i++){
            water+=Math.min(leftM[i],rightM[i])-height[i];
        }
        return water;
        
    }
}
