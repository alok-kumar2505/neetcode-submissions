class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0;
        int n=numbers.length;
        int j=n-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target && i!=j){
                return new int[]{i+1,j+1};
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
        }
       return new int[]{}; 
    }
}
