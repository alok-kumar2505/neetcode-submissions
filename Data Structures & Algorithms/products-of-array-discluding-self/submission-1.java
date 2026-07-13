class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        int[] preMul=new int[n];
        int[] posMul=new int[n];

        
        preMul[0]=1;
        posMul[n-1]=1;
        for(int i=1;i<n;i++){
            // mul=mul*nums[i-1];
            preMul[i]=preMul[i-1]*nums[i-1];

            // mul2=mul2*nums[n-i-1];;
            posMul[n-i-1]=posMul[n-i]*nums[n-i];
        }

        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=preMul[i]*posMul[i];
        }
        return ans;
        
    }
}  
