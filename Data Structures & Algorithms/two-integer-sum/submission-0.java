class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        
        int sum=0;
        while(i<=j){
            sum=nums[i]+nums[j];

            if(sum==target && i!=j){
                return new int[]{i,j};
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
        
    }
}
