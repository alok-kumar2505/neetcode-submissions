class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int pile:piles){
            max=Math.max(max,pile);
        }

        for(int s=1;s<=max;s++){
            long hours=0;
            for(int pile:piles){
                hours+=Math.ceil((double)pile/s);
            }

            if(hours<=h){
                return s;
            }
        }
        return max;
        
    }
}
