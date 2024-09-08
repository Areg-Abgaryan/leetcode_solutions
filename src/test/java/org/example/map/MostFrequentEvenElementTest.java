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
class MostFrequentEvenElementTest {

    @Test
    @Order(1)
    void testAllEvenNumbers() {
        final int[] nums = { 2, 4, 4, 2, 6, 2 };
        final int expected = 2;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(2)
    void testNoEvenNumbers() {
        final int[] nums = { 1, 3, 5, 7 };
        final int expected = -1;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(3)
    void testSingleEvenNumber() {
        final int[] nums = { 1, 3, 5, 8 };
        final int expected = 8;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(4)
    void testMixedEvenOddNumbers() {
        final int[] nums = { 1, 2, 2, 3, 4, 4, 4, 6, 6 };
        final int expected = 4;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(5)
    void testMultipleEvenNumbersSameFrequency() {
        final int[] nums = { 4, 6, 4, 6 };
        final int expected = 4;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(6)
    void testEmptyArray() {
        final int[] nums = {};
        final int expected = -1;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(7)
    void testNegativeEvenNumbers() {
        final int[] nums = { -2, -4, -4, -6, -2, -2 };
        final int expected = -2;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(8)
    void testAllSameEvenNumber() {
        final int[] nums = { 8, 8, 8, 8 };
        final int expected = 8;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(9)
    void testLargeNumbers() {
        final int[] nums = { 1000000, 500000, 1000000, 1000000 };
        final int expected = 1000000;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }

    @Test
    @Order(10)
    void testZeros() {
        final int[] nums = { 0, 0, 0, 1 };
        final int expected = 0;
        Assertions.assertEquals(expected, MostFrequentEvenElement.solution(nums));
    }
}
