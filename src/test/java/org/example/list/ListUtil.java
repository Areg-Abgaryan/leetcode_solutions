/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.list;

class ListUtil {

    static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        final var head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; ++i) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    static String listToString(ListNode node) {
        final var result = new StringBuilder();
        while (node != null) {
            if (result.length() > 0) result.append(",");
            result.append(node.val);
            node = node.next;
        }
        return result.toString();
    }
}
