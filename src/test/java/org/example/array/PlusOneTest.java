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
class PlusOneTest {

    @Test
    @Order(1)
    void testIncrementWithoutCarry() {
        final int[] digits = { 1, 2, 3 };
        final int[] expected = { 1, 2, 4 };
        Assertions.assertArrayEquals(expected, PlusOne.solution(digits));
    }

    @Test
    @Order(2)
    void testIncrementWithCarry() {
        final int[] digits = { 4, 3, 2, 1 };
        final int[] expected = { 4, 3, 2, 2 };
        Assertions.assertArrayEquals(expected, PlusOne.solution(digits));
    }

    @Test
    @Order(3)
    void testIncrementWithAllNines() {
        final int[] digits = { 9, 9, 9 };
        final int[] expected = { 1, 0, 0, 0 };
        Assertions.assertArrayEquals(expected, PlusOne.solution(digits));
    }

    @Test
    @Order(4)
    void testIncrementSingleNine() {
        final int[] digits = { 9 };
        final int[] expected = { 1, 0 };
        Assertions.assertArrayEquals(expected, PlusOne.solution(digits));
    }

    @Test
    @Order(5)
    void testIncrementSingleDigit() {
        final int[] digits = { 5 };
        final int[] expected = { 6 };
        Assertions.assertArrayEquals(expected, PlusOne.solution(digits));
    }

    @Test
    @Order(6)
    void testIncrementWithZeros() {
        final int[] digits = { 1, 0, 0, 9 };
        final int[] expected = { 1, 0, 1, 0 };
        Assertions.assertArrayEquals(expected, PlusOne.solution(digits));
    }
}
