package com.jKm;

public class D5Q1b_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode pre_R=null;         //pre
        ListNode next_R;  //current

        while(head!=null){
            next_R=head.next;       //next
            head.next=pre_R;        //change
            pre_R=head;             //pre
            head=next_R;            //current
        }
//        head=pre_R;
//        return head;
        return pre_R;
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

        print(l1);
        D5Q1b_ReverseLinkedList reverse=new D5Q1b_ReverseLinkedList();
        print(reverse.reverseList(l1));
    }

    private static void print(ListNode head) {
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }
        System.out.println(head);
    }

}
//  TC: