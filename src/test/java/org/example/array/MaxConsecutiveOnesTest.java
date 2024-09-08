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
class MaxConsecutiveOnesTest {

    @Test
    @Order(1)
    void testAllOnes() {
        final int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        Assertions.assertEquals(9, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(2)
    void testNoOnes() {
        final int[] nums = { 0, 0, 0, 0, 0, 0 };
        Assertions.assertEquals(0, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(3)
    void testMixedValues() {
        final int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1 };
        Assertions.assertEquals(3, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(4)
    void testSingleOne() {
        final int[] nums = { 0, 0, 0, 1, 0, 0 };
        Assertions.assertEquals(1, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(5)
    void testSingleZero() {
        final int[] nums = { 1, 1, 1, 0 };
        Assertions.assertEquals(3, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(6)
    void testEmptyArray() {
        final int[] nums = { };
        Assertions.assertEquals(0, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(7)
    void testSingleElementArray() {
        final int[] nums1 = { 1 };
        final int[] nums2 = { 0 };
        Assertions.assertEquals(1, MaxConsecutiveOnes.solution(nums1));
        Assertions.assertEquals(0, MaxConsecutiveOnes.solution(nums2));
    }

    @Test
    @Order(8)
    void testLongestSubsequenceAtEnd() {
        final int[] nums = { 0, 1, 1, 1, 1 };
        Assertions.assertEquals(4, MaxConsecutiveOnes.solution(nums));
    }

    @Test
    @Order(9)
    void testLongestSubsequenceAtStart() {
        final int[] nums = { 1, 1, 1, 0, 0 };
        Assertions.assertEquals(3, MaxConsecutiveOnes.solution(nums));
    }
}
