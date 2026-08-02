/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
            // ListNode ans=null;

            // for(ListNode list:lists){
            //     ans=mergeTwoList(ans,list);
            // }
            // return ans;

            //Another optimal approach

            PriorityQueue <ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);

            for(ListNode node:lists){
                if(node!=null){
                    pq.offer(node);
                }
            }

            ListNode dummy=new ListNode(0);
            ListNode tail=dummy;

            while(!pq.isEmpty()){
                ListNode curr=pq.poll();
                tail.next=curr;
                tail=tail.next;
                if(curr.next !=null){
                    pq.offer(curr.next);
                }
            }
            return dummy.next;


    }

    // public ListNode mergeTwoList(ListNode list1,ListNode list2){

    //     ListNode dummy=new ListNode(0);
    //     ListNode tail=dummy
    //     ;

    //     while(list1!=null && list2!=null){
    //     if(list1.val<=list2.val){
    //         tail.next=list1;
    //         list1=list1.next;
    //     }else{
    //         tail.next=list2;
    //         list2=list2.next;
    //     }
    //     tail=tail.next;
    //     }

    //     if(list1!=null){
    //         tail.next=list1;
    //     }else{
    //         tail.next=list2;
    //     }
    //     return dummy.next;
    // }
}
