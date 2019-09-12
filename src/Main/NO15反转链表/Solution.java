package Main.NO15反转链表;


/**
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode p=head;
        ListNode pre=null,end=null;
        while(p!=null){
            end=p.next;
            p.next=pre;
            pre=p;
            p=end;

        }
        return pre;
    }
}