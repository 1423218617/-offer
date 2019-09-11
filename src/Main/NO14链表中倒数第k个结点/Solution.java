package Main.NO14链表中倒数第k个结点;


/**
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
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
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        ListNode p=head;
        int num=0;
        while(p!=null){
            num++;
            p=p.next;
        }
        if(num<k){
            return null;
        }
        p=head;
        int num2=0;
        while(num2+k!=num){
            p=p.next;
            num2++;
        }
        return p;
    }
}