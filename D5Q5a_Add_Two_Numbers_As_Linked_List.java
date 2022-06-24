package com.jKm;

public class D5Q5a_Add_Two_Numbers_As_Linked_List {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head=new ListNode();
        ListNode temp=dummy_head;
        int c=0;
        while (l1!=null||l2!=null||c!=0){
            int sum=0;
            if (l1!=null) {
                sum += l1.val;
                l1=l1.next;
            }
            if (l2!=null) {
                sum += l2.val;
                l2=l2.next;
            }
            sum+=c;
            c=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }

        return dummy_head.next;
    }
    public static void main(String[] args) {

        ListNode l3=new ListNode();
        l3.val=9;
        l3.next=null;

        ListNode l2=new ListNode();
        l2.val=9;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=9;
        l1.next=l2;

        print(l1);

//        ListNode al3=new ListNode();
//        al3.val=4;
//        al3.next=null;

        ListNode al2=new ListNode();
        al2.val=9;
        al2.next=null;

        ListNode al1=new ListNode();
        al1.val=9;
        al1.next=al2;

        print(al1);

        D5Q5a_Add_Two_Numbers_As_Linked_List sum=new D5Q5a_Add_Two_Numbers_As_Linked_List();
        print(sum.addTwoNumbers(l1,al1));
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.println(head);
    }







}
