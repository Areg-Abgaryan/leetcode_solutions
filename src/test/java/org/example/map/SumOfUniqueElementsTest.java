/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SumOfUniqueElementsTest {

    @Test
    @Order(1)
    void testAllUniqueElements() {
        final int[] nums = { 1, 2, 3, 4, 5 };
        final int expected = 15;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(2)
    void testNoUniqueElements() {
        final int[] nums = { 2, 2, 3, 3, 4, 4 };
        final int expected = 0;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(3)
    void testMixedUniqueAndNonUniqueElements() {
        final int[] nums = { 1, 2, 2, 3, 4, 4, 5 };
        final int expected = 9;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(4)
    void testSingleElementArray() {
        int[] nums = { 7 };
        int expected = 7;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(5)
    void testEmptyArray() {
        final int[] nums = {};
        final int expected = 0;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(6)
    void testAllElementsSame() {
        final int[] nums = { 9, 9, 9, 9 };
        final int expected = 0;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(7)
    void testNegativeNumbers() {
        final int[] nums = { -1, -2, -2, -3, -4, -4, -5 };
        final int expected = -9;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(8)
    void testLargeArrayWithUniqueAndNonUnique() {
        final int[] nums = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7 };
        final int expected = 17;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(9)
    void testArrayWithZeros() {
        final int[] nums = { 0, 0, 1, 2, 2 };
        final int expected = 1;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }

    @Test
    @Order(10)
    void testArrayWithOneUniqueElement() {
        final int[] nums = { 8, 8, 8, 7, 8 };
        final int expected = 7;
        Assertions.assertEquals(expected, SumOfUniqueElements.solution(nums));
    }
}
