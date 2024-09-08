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
class MonotonicArrayTest {

    @Test
    @Order(1)
    void testMonotoneAscending() {
        final int[] nums = { 1, 2, 2, 3, 4, 5 };
        final boolean expected = true;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }

    @Test
    @Order(2)
    void testMonotoneDescending() {
        final int[] nums = { 9, 7, 5, 5, 3, 2, 1 };
        final boolean expected = true;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }

    @Test
    @Order(3)
    void testNotMonotonic() {
        final int[] nums = { 1, 3, 2, 4, 5 };
        final boolean expected = false;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }

    @Test
    @Order(4)
    void testSingleElementArray() {
        final int[] nums = { 5 };
        final boolean expected = true;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }

    @Test
    @Order(5)
    void testEmptyArray() {
        final int[] nums = { };
        final boolean expected = true;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }

    @Test
    @Order(6)
    void testAllEqualElements() {
        final int[] nums = { 5, 5, 5, 5, 5 };
        final boolean expected = true;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }

    @Test
    @Order(7)
    void testAscendingAndDescending() {
        final int[] nums = { 2, 2, 2, 1, 4, 5 };
        final boolean expected = false;
        Assertions.assertEquals(expected, MonotonicArray.solution(nums));
    }
}
