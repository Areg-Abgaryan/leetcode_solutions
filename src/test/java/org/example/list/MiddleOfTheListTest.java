/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MiddleOfTheListTest {

    @Test
    @Order(1)
    void testFindMiddleOddLength() {
        final int[] values = { 1, 2, 3, 4, 5 };
        final ListNode head = createList(values);
        final ListNode middle = MiddleOfTheList.solution(head);
        Assertions.assertEquals("3,4,5", listToString(middle));
    }

    @Test
    @Order(2)
    void testFindMiddleEvenLength() {
        final int[] values = { 1, 2, 3, 4, 5, 6 };
        final ListNode head = createList(values);
        final ListNode middle = MiddleOfTheList.solution(head);
        Assertions.assertEquals("4,5,6", listToString(middle));
    }

    @Test
    @Order(3)
    void testFindMiddleSingleNode() {
        final int[] values = { 1 };
        final ListNode head = createList(values);
        final ListNode middle = MiddleOfTheList.solution(head);
        Assertions.assertEquals("1", listToString(middle));
    }

    @Test
    @Order(4)
    void testFindMiddleEmptyList() {
        final int[] values = { };
        final ListNode head = createList(values);
        final ListNode middle = MiddleOfTheList.solution(head);
        Assertions.assertNull(middle);
    }


    private static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        final var head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; ++i) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    private static String listToString(ListNode node) {
        final var result = new StringBuilder();
        while (node != null) {
            if (result.length() > 0) result.append(",");
            result.append(node.val);
            node = node.next;
        }
        return result.toString();
    }
}
