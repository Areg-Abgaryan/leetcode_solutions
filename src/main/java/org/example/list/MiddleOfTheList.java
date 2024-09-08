/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.list;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">...</a>
 */
public class MiddleOfTheList {

    public static void demo() {

        System.out.println("\nDemo MiddleOfTheList problem :");

        //  Create the linked list
        final var list1 = new ListNode(1);
        list1.next = new ListNode(7);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(2);
        list1.next.next.next.next = new ListNode(10);

        final ListNode answer = solution(list1);
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static ListNode solution(ListNode head) {

        //  Simple case
        if (head == null) return null;

        //  On each step move first pointer with one step, second - with two
        ListNode first = head, second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        return first;
    }
}
