class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayList <Integer> ans=new ArrayList<>();

        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
            for(int j=i+1;j<i+k;j++){
                if(max<nums[j]){
                    max=nums[j];
                }
            }
            ans.add(max);
        }
        int[] arr=new int[ans.size()];
        int cnt=0;
        for(int num:ans){
            arr[cnt++]=num;
        }
        return arr;

        
    }
}
