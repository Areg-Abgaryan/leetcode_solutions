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
class LongestContinuousIncreasingSubsequenceTest {

    @Test
    @Order(1)
    void test() {
        final int[] nums = { 1, 2, 7, 3, 0, 5, 6, 9 };
        final int expected = 4;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(1)
    void testSimpleIncreasingSequence() {
        final int[] nums = { 1, 2, 3, 4, 5 };
        final int expected = 5;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(2)
    void testNoIncreasingSequence() {
        final int[] nums = { 5, 4, 3, 2, 1 };
        final int expected = 1;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(3)
    void testSingleElementArray() {
        final int[] nums = { 10 };
        final int expected = 1;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(4)
    void testMixedSequence() {
        final int[] nums = { 1, 3, 5, 4, 7 };
        final int expected = 3;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(5)
    void testRepeatedElements() {
        final int[] nums = { 2, 2, 2, 2, 2 };
        final int expected = 1;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(6)
    void testEmptyArray() {
        final int[] nums = { };
        final int expected = 0;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(7)
    void testMultipleIncreasingSubsequences() {
        final int[] nums = { 1, 2, 7, 3, 0, 5, 6, 9 };
        final int expected = 4;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(8)
    void testSequenceWithNegatives() {
        final int[] nums = { -1, 0, 1, -2, -1, 2 };
        final int expected = 3;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(9)
    void testSequenceWithMinAndMaxIntegers() {
        final int[] nums = { Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE };
        final int expected = 4;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }

    @Test
    @Order(10)
    void testSequenceEndingWithLongestSubsequence() {
        final int[] nums = { 5, 3, 4, 5, 6 };
        final int expected = 4;
        Assertions.assertEquals(expected, LongestContinuousIncreasingSubsequence.solution(nums));
    }
}
