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
class MaxProductOfThreeNumbersTest {

    @Test
    @Order(1)
    void testAllPositiveNumbers() {
        final int[] nums = { 1, 2, 10, 3, 0, 5, 6 };
        final int expected = 300;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(2)
    void testAllNegativeNumbers() {
        final int[] nums = { -1, -2, -3, -4 };
        final int expected = -6;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(3)
    void testMixedPositiveAndNegativeNumbers() {
        final int[] nums = { -10, -10, 5, 2 };
        final int expected = 500;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(4)
    void testMixedNumbersWithZero() {
        final int[] nums = { 0, -1, 3, 100, -70, 50 };
        final int expected = 15000;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(5)
    void testArrayWithZeros() {
        final int[] nums = { 0, 0, 0 };
        final int expected = 0;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(6)
    void testNegativeThreeNumbers() {
        final int[] nums = { -1, -2, -3 };
        final int expected = -6;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }


    @Test
    @Order(7)
    void testPositiveThreeElements() {
        final int[] nums = { 1, 2, 3 };
        final int expected = 6;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(8)
    void testArrayWithDuplicates() {
        final int[] nums = { 1, 2, 2, 2, 3 };
        final int expected = 12;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }

    @Test
    @Order(9)
    void testArrayWithAllEqualElements() {
        final int[] nums = { 1, 1, 1 };
        final int expected = 1;
        Assertions.assertEquals(expected, MaxProductOfThreeNumbers.solution(nums));
    }
}
