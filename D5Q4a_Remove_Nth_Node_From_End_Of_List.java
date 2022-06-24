package com.jKm;

public class D5Q4a_Remove_Nth_Node_From_End_Of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy_head=head;
        ListNode temp=head;
        int count =0;
        while (dummy_head!=null){
            dummy_head =dummy_head.next;
            count++;
        }
        int del=count-n;
        if (del == 0) return head.next;
        for (int i = 1; i <del ; i++) temp=temp.next;
        temp.next=temp.next.next;
        return head;
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
        D5Q4a_Remove_Nth_Node_From_End_Of_List remove=new D5Q4a_Remove_Nth_Node_From_End_Of_List();
//            print(remove.removeNthFromEnd(l1,1));
//        print(remove.removeNthFromEnd(l1,2));
//        print(remove.removeNthFromEnd(l1,3));
//        print(remove.removeNthFromEnd(l1,4));
        print(remove.removeNthFromEnd(l1,5));


    }
}






