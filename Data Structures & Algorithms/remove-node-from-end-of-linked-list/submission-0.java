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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;

        ListNode temp=head;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==1) return null;
        int dlt=size-n-1;
        temp=head;
        int cnt=0;

        while(cnt<dlt){
            temp=temp.next;
            cnt++;
        }
        System.out.print(temp.val);


        temp.next=temp.next.next;

        return head;

    }
}
