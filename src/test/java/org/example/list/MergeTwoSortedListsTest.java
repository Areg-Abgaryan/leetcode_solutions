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
class MergeTwoSortedListsTest {

    @Test
    @Order(1)
    void testEmptyListAndNonEmptyList() {
        final var list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(4);

        final ListNode mergedList = MergeTwoSortedLists.solution(null, list2);

        Assertions.assertEquals(1, mergedList.val);
        Assertions.assertEquals(2, mergedList.next.val);
        Assertions.assertEquals(4, mergedList.next.next.val);
        Assertions.assertNull(mergedList.next.next.next);
    }

    @Test
    @Order(2)
    void testNonEmptyLists() {
        final var list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        final var list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(7);

        final ListNode mergedList = MergeTwoSortedLists.solution(list1, list2);

        Assertions.assertEquals(1, mergedList.val);
        Assertions.assertEquals(1, mergedList.next.val);
        Assertions.assertEquals(2, mergedList.next.next.val);
        Assertions.assertEquals(3, mergedList.next.next.next.val);
        Assertions.assertEquals(4, mergedList.next.next.next.next.val);
        Assertions.assertEquals(7, mergedList.next.next.next.next.next.val);
        Assertions.assertNull(mergedList.next.next.next.next.next.next);
    }

    @Test
    @Order(3)
    void testListsWithDuplicates() {
        final var list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(2);

        final var list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(3);

        final ListNode mergedList = MergeTwoSortedLists.solution(list1, list2);
        Assertions.assertEquals(1, mergedList.val);
        Assertions.assertEquals(1, mergedList.next.val);
        Assertions.assertEquals(2, mergedList.next.next.val);
        Assertions.assertEquals(2, mergedList.next.next.next.val);
        Assertions.assertEquals(3, mergedList.next.next.next.next.val);
        Assertions.assertEquals(3, mergedList.next.next.next.next.next.val);
        Assertions.assertNull(mergedList.next.next.next.next.next.next);
    }
}
