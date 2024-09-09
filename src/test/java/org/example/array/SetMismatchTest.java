/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class SetMismatchTest {

    @Test
    @Order(1)
    void testSimpleCase() {
        final int[] nums = { 1, 2, 2, 4 };
        final int[] expected = { 2, 3 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }

    @Test
    @Order(2)
    void testTwoElements() {
        final int[] nums = { 1, 1 };
        final int[] expected = { 1, 2 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }

    @Test
    @Order(3)
    void testMissingFirstNumber() {
        final int[] nums = { 2, 2, 3, 4 };
        final int[] expected = { 2, 1 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }

    @Test
    @Order(4)
    void testMissingLastNumber() {
        final int[] nums = { 1, 2, 3, 3 };
        final int[] expected = { 3, 4 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }

    @Test
    @Order(5)
    void testSingleNumberDuplicated() {
        final int[] nums = { 1, 1 };
        final int[] expected = { 1, 2 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }

    @Test
    @Order(6)
    void testLargerArray() {
        final int[] nums = { 1, 2, 2, 3, 5 };
        final int[] expected = { 2, 4 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }

    @Test
    @Order(7)
    void testNoError() {
        final int[] nums = { 1, 2, 2, 4 };
        final int[] expected = { 2, 3 };
        Assertions.assertArrayEquals(expected, SetMismatch.solution(nums));
    }
}
