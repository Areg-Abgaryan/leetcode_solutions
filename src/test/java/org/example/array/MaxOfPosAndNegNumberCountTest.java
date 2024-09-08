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
class MaxOfPosAndNegNumberCountTest {

    @Test
    @Order(1)
    void testAllPositiveNumbers() {
        final int[] nums = { 1, 2, 3, 4, 5 };
        final int expected = 5;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(2)
    void testAllNegativeNumbers() {
        final int[] nums = { -1, -2, -3, -4, -5 };
        final int expected = 5;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(3)
    void testEqualPositiveAndNegativeNumbers() {
        final int[] nums = { -1, -2, 3, 4 };
        final int expected = 2;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(4)
    void testMorePositiveThanNegativeNumbers() {
        final int[] nums = { -1, 1, 2, 3, 4 };
        final int expected = 4;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(5)
    void testMoreNegativeThanPositiveNumbers() {
        final int[] nums = { -1, -2, -3, 1 };
        final int expected = 3;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(6)
    void testMixedNumbersIncludingZeros() {
        final int[] nums = { -1, -2, 0, 3, 4 };
        final int expected = 2;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(7)
    void testOnlyZeros() {
        final int[] nums = { 0, 0, 0 };
        final int expected = 0;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(8)
    void testEmptyArray() {
        final int[] nums = { };
        final int expected = 0;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(9)
    void testOnePositiveNumber() {
        final int[] nums = { 5 };
        final int expected = 1;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }

    @Test
    @Order(10)
    void testOneNegativeNumber() {
        final int[] nums = { -5 };
        final int expected = 1;
        Assertions.assertEquals(expected, MaxOfPosAndNegNumberCount.solution(nums));
    }
}
