class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //suppose this prblem as binary search and  matrix as 1d array
        //and  calclate row by dividing and column by modulo with col length
        int m=matrix.length;
        int n=matrix[0].length;

        int st=0;
        int end=m*n-1;

        while(st<=end){

            int mid=st+(end-st)/2;
            int row=mid/n;
            int col=mid%n;

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
        
    }
}
