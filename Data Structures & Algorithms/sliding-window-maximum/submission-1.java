class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];

        Deque <Integer> dq=new LinkedList<>();
        int idx=0;
        for(int i=0;i<n;i++){

            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst(); //remove idx which is not in window
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();  //removing smaller element from back
            }

            dq.offerLast(i);
            if(i>=k-1){
                ans[idx++]=nums[dq.peekFirst()];
            }
        }
        return ans;
        
    }
}
