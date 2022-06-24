package com.jKm;
public class D5Q1a_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre_R=null;         //pre
        ListNode cur_R=head,next_R;  //current
        while(cur_R!=null){
            next_R=cur_R.next;       //next
            cur_R.next=pre_R;        //change
            pre_R=cur_R;             //pre
            cur_R=next_R;            //current
        }
        head=pre_R;
        return head;
//        return pre_R;
    }
    public static void print(ListNode head) {
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println(head);
    }
    public static void main(String[] args) {
        ListNode l5=new ListNode();
        l5.val=5;
        l5.next=null;

        ListNode l4=new ListNode();
        l4.val=4;
        l4.next=l5;

        ListNode l3=new ListNode();
        l3.val=3;
        l3.next=l4;

        ListNode l2=new ListNode();
        l2.val=2;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=l2;
//        print(l1);
//        print(l2);
//        print(l3);
//        print(l4);
//        print(l5);
        D5Q1a_ReverseLinkedList reverse=new D5Q1a_ReverseLinkedList();
        print(reverse.reverseList(l1));
    }
}
//  TC:O(N)
//  SC:O(1) / O(C)
