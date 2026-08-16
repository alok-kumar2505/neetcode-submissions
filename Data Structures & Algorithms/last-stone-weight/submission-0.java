class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:stones){
            pq.add(num);
        }

        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            System.out.println(x+"-"+y);

            if(x<y){
                pq.add(y-x);
            }else if(y<x){
                pq.add(x-y);
            }
        }
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return 0;
        
    }
}
