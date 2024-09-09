/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.list;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">...</a>
 */
public class RemoveDuplicatesFromSortedList {

    public static void demo() {

        System.out.println("\nDemo RemoveDuplicatesFromSortedList problem :");

        //  Create the linked list
        final var list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(2);
        list1.next.next.next.next = new ListNode(4);

        final ListNode answer = solution(list1);
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static ListNode solution(ListNode head) {

        //  Simple case
        if (head == null) return null;

        //  Store a copy of the head pointer
        final ListNode originalHead = head;

        while (head.next != null) {
            if (head.val == head.next.val) {
                //  Omit repeating elements
                head.next = head.next.next;
            } else {
                //  Go on to the next element
                head = head.next;
            }
        }

        return originalHead;
    }
}
