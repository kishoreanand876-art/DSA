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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
           return head;
        }
        ListNode pre=new ListNode();
        ListNode dummy=pre;
        dummy.next=head;
        ListNode cur=head;
        while(cur!=null&&cur.next!=null){
            if(cur.val==cur.next.val){
               while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
               }
               dummy.next=cur.next;
            }else{
                dummy=dummy.next;
            }
            cur=cur.next;
        }
        return pre.next;
    }
}