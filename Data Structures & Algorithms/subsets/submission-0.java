class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,ans,0,new ArrayList<>());
        return ans;
        
    }

    public void helper(int[] nums,List<List<Integer>> ans,int i,List <Integer> current){
        ans.add(new ArrayList<>(current));

        for(int j=i;j<nums.length;j++){
            current.add(nums[j]);

            helper(nums,ans,j+1,current);

            current.remove(current.size()-1);
        }

    
    }
}
