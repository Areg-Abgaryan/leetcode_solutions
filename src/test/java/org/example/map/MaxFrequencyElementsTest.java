/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.stream.IntStream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MaxFrequencyElementsTest {

    @Test
    @Order(1)
    void testSingleElementArray() {
        final int[] nums = { 5 };
        final int expected = 1;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(2)
    void testAllUniqueElements() {
        final int[] nums = { 1, 2, 3, 4, 5 };
        final int expected = 5; // Each element has a frequency of 1, which is the max frequency
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(3)
    void testAllElementsSame() {
        final int[] nums = { 2, 2, 2, 2 };
        final int expected = 4;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(4)
    void testTwoElementsWithSameMaxFrequency() {
        final int[] nums = { 1, 2, 2, 3, 3 };
        //  2 and 3 both have max frequency (2 each), so the sum is 2 + 2 = 4
        final int expected = 4;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(5)
    void testMultipleElementsWithDifferentFrequencies() {
        final int[] nums = { 4, 4, 6, 6, 6, 7, 8, 8 };
        final int expected = 3;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(6)
    void testNegativeNumbers() {
        final int[] nums = { -1, -2, -2, -3, -3, -3 };
        final int expected = 3;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(7)
    void testMixedPositiveAndNegativeNumbers() {
        final int[] nums = {1, -1, 2, -1, 2, 2};
        final int expected = 3; // 2 has the max frequency of 3
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(8)
    void testEmptyArray() {
        final int[] nums = {};
        final int expected = 0;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(9)
    void testLargeArrayWithUniformFrequency() {
        final int[] nums = IntStream.range(0, 1000).map(i -> i % 10).toArray();
        final int expected = 1000;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }

    @Test
    @Order(10)
    void testLargeArrayWithOneDominantElement() {
        final int[] nums = new int[1000];
        Arrays.fill(nums, 999);
        final int expected = 1000;
        Assertions.assertEquals(expected, MaxFrequencyElements.solution(nums));
    }
}
