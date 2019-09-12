package Main.NO16合并有序链表;

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
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p1=list1,p2=list2;
        ListNode head=new ListNode(-1) ;
        ListNode root =head;
        while(p1!=null&&p2!=null){
            if(p1.val<p2.val){
                head.next=p1;
                head=p1;
                p1=p1.next;
            }else{
                head.next=p2;
                head=p2;
                p2=p2.next;
            }
        }
        if(p1!=null){
            head.next=p1;
        }
        if(p2!=null){
            head.next=p2;
        }
        return root.next;
    }
}