/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SearchIndexPositionTest {

    @Test
    @Order(1)
    void testArrayWithOneElement() {
        final int[] nums = new int[] { 1 };
        final int target = 1, expected = 0;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }


    @Test
    @Order(2)
    void testSingleElementArrayTargetFound() {
        final int[] nums = { 5 };
        final int target = 5, expected = 0;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }

    @Test
    @Order(3)
    void testTargetFoundAtTheEnd() {
        final int[] nums = { 1, 3, 5, 7, 9 };
        final int target = 9, expected = 4;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }

    @Test
    @Order(4)
    void testTargetNotFoundInsertAtStart() {
        final int[] nums = { 2, 4, 6, 8, 10 };
        final int target = 1, expected = 0;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }

    @Test
    @Order(5)
    void testTargetNotFoundInsertInMiddle() {
        final int[] nums = { 1, 3, 5, 7, 9 };
        final int target = 6, expected = 3;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }

    @Test
    @Order(6)
    void testTargetNotFoundInsertAtEnd() {
        final int[] nums = { 1, 3, 5, 7, 9 };
        final int target = 10, expected = 5;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }

    @Test
    @Order(7)
    void testEmptyArray() {
        final int[] nums = { };
        final int target = 5, expected = 0;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }

    @Test
    @Order(8)
    void testSingleElementArrayTargetNotFound() {
        final int[] nums = { 3 };
        final int target = 5, expected = 1;
        Assertions.assertEquals(expected, SearchIndexPosition.solution(nums, target));
    }
}
