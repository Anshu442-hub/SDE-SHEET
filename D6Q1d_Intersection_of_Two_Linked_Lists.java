package com.jKm;

public class D6Q1d_Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null||headB==null) return null;
        ListNode dummy1=headA;
        ListNode dummy2=headB;

        while (dummy1!=dummy2){
            if (dummy1==null)dummy1=headB;
            else  dummy1=dummy1.next;
            if(dummy2==null) dummy2=headA;
            else dummy2=dummy2.next;
        }
        return  dummy2;
    }
    public static void main(String[] args) {

        ListNode l5=new ListNode();
        l5.val=6;
        l5.next=null;

        ListNode l4=new ListNode();
        l4.val=7;
        l4.next=l5;

        ListNode l3=new ListNode();
        l3.val=8;
        l3.next=l4;

        ListNode l2=new ListNode();
        l2.val=2;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=l2;

        print(l1);
        //
        ListNode al7=new ListNode();
        al7.val=6;
        al7.next=null;

        ListNode al6=new ListNode();
        al6.val=7;
        al6.next=al7;

        ListNode al5=new ListNode();
        al5.val=8;
        al5.next=l3;

        ListNode al4=new ListNode();
        al4.val=3;
        al4.next=al5;

        ListNode al3=new ListNode();
        al3.val=1;
        al3.next=al4;

        ListNode al2=new ListNode();
        al2.val=8;
        al2.next=al3;

        ListNode al1=new ListNode();
        al1.val=2;
        al1.next=al2;

        print(al1);

        D6Q1d_Intersection_of_Two_Linked_Lists intersection=new D6Q1d_Intersection_of_Two_Linked_Lists();
        print(intersection.getIntersectionNode(l1,al1));
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.println(head);
    }

}
