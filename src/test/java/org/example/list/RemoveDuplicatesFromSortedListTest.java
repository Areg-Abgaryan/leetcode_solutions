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
class RemoveDuplicatesFromSortedListTest {

    @Test
    @Order(1)
    void testRemoveDuplicates() {
        final ListNode head = ListUtil.createList(new int[]{ 1, 1, 2 });
        final ListNode result = RemoveDuplicatesFromSortedList.solution(head);
        Assertions.assertEquals("1,2", ListUtil.listToString(result));
    }

    @Test
    @Order(2)
    void testNoDuplicates() {
        final ListNode head = ListUtil.createList(new int[]{ 1, 2, 3 });
        final ListNode result = RemoveDuplicatesFromSortedList.solution(head);
        Assertions.assertEquals("1,2,3", ListUtil.listToString(result));
    }

    @Test
    @Order(3)
    void testAllDuplicates() {
        final ListNode head = ListUtil.createList(new int[]{ 1, 1, 1 });
        final ListNode result = RemoveDuplicatesFromSortedList.solution(head);
        Assertions.assertEquals("1", ListUtil.listToString(result));
    }

    @Test
    @Order(4)
    void testEmptyList() {
        final ListNode head = ListUtil.createList(new int[]{ });
        final ListNode result = RemoveDuplicatesFromSortedList.solution(head);
        Assertions.assertEquals("", ListUtil.listToString(result));
    }

    @Test
    @Order(5)
    void testSingleElement() {
        final ListNode head = ListUtil.createList(new int[]{ 1 });
        final ListNode result = RemoveDuplicatesFromSortedList.solution(head);
        Assertions.assertEquals("1", ListUtil.listToString(result));
    }
}
