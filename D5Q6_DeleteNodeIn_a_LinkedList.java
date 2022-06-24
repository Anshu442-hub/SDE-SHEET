package com.jKm;

public class D5Q6_DeleteNodeIn_a_LinkedList {
    public void deleteNode(ListNode node) {
//        ListNode.printLinkedList(node);
        while (node.next.next!=null){
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;
    }
}
