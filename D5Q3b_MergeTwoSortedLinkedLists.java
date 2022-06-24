package com.jKm;

public class D5Q3b_MergeTwoSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1==null)return list2;
        if (list2==null)return list1;
        if (list1.val > list2.val) {
            ListNode tem = list1;
            list1 = list2;
            list2 = tem;
        }
        ListNode res = list1;
        ListNode temp = null;
        while (list1 != null && list2 != null){
            while (list1 != null && list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            }
            temp.next=list2;
            ListNode tem=list1;
            list1=list2;
            list2=tem;
    }


        return  res;
    }

        public static void main(String[] args) {

        ListNode l3=new ListNode();
        l3.val=4;
        l3.next=null;

        ListNode l2=new ListNode();
        l2.val=2;
        l2.next=l3;

        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=l2;

        print(l1);

        ListNode al3=new ListNode();
        al3.val=4;
        al3.next=null;

        ListNode al2=new ListNode();
        al2.val=3;
        al2.next=al3;

        ListNode al1=new ListNode();
        al1.val=1;
        al1.next=al2;

        print(al1);

        D5Q3b_MergeTwoSortedLinkedLists merge=new D5Q3b_MergeTwoSortedLinkedLists();
        print(merge.mergeTwoLists(l1,al1));
    }

    private static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.println(head);
    }
}
