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
class ThirdMaximumNumberTest {

    @Test
    @Order(1)
    void testDistinctThreeMaximums() {
        final int[] nums = { 3, 2, 1 };
        final int expected = 1;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(2)
    void testLessThanThreeDistinctNumbers() {
        final int[] nums = { 1, 2 };
        final int expected = 2;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(3)
    void testRepeatedNumbers() {
        final int[] nums = { 2, 2, 3, 1 };
        final int expected = 1;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(4)
    void testWithMinValue() {
        final int[] nums = { 1, 2, Integer.MIN_VALUE };
        final int expected = Integer.MIN_VALUE;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(5)
    void testNegativeNumbers() {
        final int[] nums = { -1, -2, -3, -4 };
        final int expected = -3;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(6)
    void testMixedPositiveNegativeNumbers() {
        final int[] nums = { 1, -1, 2, -2, 3 };
        final int expected = 1;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(7)
    void testZerosAndNegatives() {
        final int[] nums = { 0, -1, -2 };
        final int expected = -2;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }

    @Test
    @Order(8)
    void testThirdMaxAtEnd() {
        final int[] nums = { 3, 1, 2 };
        final int expected = 1;
        Assertions.assertEquals(expected, ThirdMaximumNumber.solution(nums));
    }
}
