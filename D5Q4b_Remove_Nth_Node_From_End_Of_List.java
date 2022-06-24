package com.jKm;

public class D5Q4b_Remove_Nth_Node_From_End_Of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy_head=new ListNode();
        dummy_head.next=head;

        ListNode slow=dummy_head;
        ListNode fast=dummy_head;

        while(n-->0) fast=fast.next;
        while (fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }

        slow.next=slow.next.next;


        //        return head;   //wrong
        return dummy_head.next;
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
        print(l1);
//        print(l2);
//        print(l3);
//        print(l4);
//        print(l5);
        D5Q4b_Remove_Nth_Node_From_End_Of_List remove=new D5Q4b_Remove_Nth_Node_From_End_Of_List();
//            print(remove.removeNthFromEnd(l1,1));
//        print(remove.removeNthFromEnd(l1,2));
//        print(remove.removeNthFromEnd(l1,3));
//        print(remove.removeNthFromEnd(l1,4));
        print(remove.removeNthFromEnd(l1,5));


    }
}
