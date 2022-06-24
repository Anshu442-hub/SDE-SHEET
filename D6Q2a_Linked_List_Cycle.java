package com.jKm;

import java.util.HashSet;

public class D6Q2a_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hset=new HashSet<>();
        while (head!=null){
            if(hset.contains(head)) return true;
            hset.add(head);
            head=head.next;
        }
        return false;
    }





}
