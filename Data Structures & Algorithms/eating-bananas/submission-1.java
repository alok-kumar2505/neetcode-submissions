class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int pile:piles){
            max=Math.max(max,pile);
        }
        int left=1;
        int right=max;

        while(left<=right){
            long hours=0;
            int mid=left+(right-left)/2;

            for(int pile:piles){
                hours+=Math.ceil((double)pile/mid);
            }

            if(hours<=h){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
        
    }
}
