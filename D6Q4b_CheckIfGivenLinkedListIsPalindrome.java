package com.jKm;

import java.util.HashMap;
import java.util.List;
public class D6Q4b_CheckIfGivenLinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int l=0;
        ListNode temp=head;
        while (temp!=null){
            l++;
            temp=temp.next;
        }
        System.out.println(l);
        int mid=l/2;
        int tempMid=mid;
//        if (l%2==0) mid=mid-1;
        temp=head;
        while (mid-->0){
            hmap.put(temp.val, mid);
            temp=temp.next;
        }
        while (tempMid-->0|| temp!=null){
            if (hmap.get(temp.val)!=null){
                temp=temp.next;
                return false;
            }
            temp=temp.next;
            return  true;
        }
        return  true;
    }
    public static void main(String[] args) {
            D6Q4b_CheckIfGivenLinkedListIsPalindrome palindrome=new D6Q4b_CheckIfGivenLinkedListIsPalindrome();
            ListNode head1=Node.getHeadPalindrome1();
            Node.printLinkedList(head1);
            System.out.println(palindrome.isPalindrome(head1));
            ListNode head2=Node.getHeadPalindrome2();
            Node.printLinkedList(head2);
            System.out.println(palindrome.isPalindrome(head2));
        }

    }


