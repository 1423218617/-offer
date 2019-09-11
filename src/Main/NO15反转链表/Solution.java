package Main.NO15反转链表;

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