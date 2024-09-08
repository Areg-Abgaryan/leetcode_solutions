/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.list;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 */
public class MergeTwoSortedLists {

    public static void demo() {

        System.out.println("\nDemo MergeTwoSortedLists problem :");

        //  Create the first linked list
        final var list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        //  Create the second linked list
        final var list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(7);

        //  [1,2,4], [1,3,7]
        ListNode answer = solution(list1, list2);
        while (answer != null) {
            System.out.print(answer.val + " ");
            answer = answer.next;
        }
    }

    /**
     * O(n+m) complexity + O(1) space solution
     */
    static ListNode solution(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        final var node = new ListNode(Math.min(list1.val, list2.val));
        ListNode temp = node;

        //  Merge until one of the lists is empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        //  If any of the lists still has elements, point the next pointer to it,
        //  so all remaining values of the list will automatically be attached
        temp.next = (list1 != null ? list1 : list2);

        return node.next;
    }
}
