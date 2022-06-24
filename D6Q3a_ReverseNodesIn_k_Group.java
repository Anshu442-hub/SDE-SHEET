package com.jKm;

public class D6Q3a_ReverseNodesIn_k_Group {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null||k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur = dummy,nex=dummy,pre=dummy;

        int count=0;
        while (cur.next!=null){
            cur=cur.next;
            count++;
        }
        while (count>=k){
            cur=pre.next;
            nex=cur.next;
            for (int j = 1; j < k; j++) {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            pre=cur;
            count-=k;
        }

        return dummy.next;
    }
    public static void main(String[] args) {


        ListNode l8 = new ListNode();
        l8.val = 8;
        l8.next = null;

        ListNode l7 = new ListNode();
        l7.val = 7;
        l7.next = l8;

        ListNode l6 = new ListNode();
        l6.val = 6;
        l6.next = l7;

        ListNode l5 = new ListNode();
        l5.val = 5;
        l5.next = l6;

        ListNode l4 = new ListNode();
        l4.val = 4;
        l4.next = l5;

        ListNode l3 = new ListNode();
        l3.val = 3;
        l3.next = l4;

        ListNode l2 = new ListNode();
        l2.val = 2;
        l2.next = l3;

        ListNode l1 = new ListNode();
        l1.val = 1;
        l1.next = l2;

        print(l1);

        D6Q3a_ReverseNodesIn_k_Group group = new D6Q3a_ReverseNodesIn_k_Group();
        print(group.reverseKGroup(l1, 3));
    }
        private static void print(ListNode head) {
            while (head != null) {
                System.out.print(head.val + "-->");
                head = head.next;
            }
            System.out.println(head);
        }






}
