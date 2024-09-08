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
class MoveZeroesTest {

    @Test
    @Order(1)
    void testRandomElements() {
        final int[] nums = { 0, 1, 0, 3, 12 };
        final int[] expected = { 1, 3, 12, 0, 0 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(2)
    void testTwoElements() {
        final int[] nums = { 1, 0 };
        final int[] expected = { 1, 0 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(3)
    void testThreeElements() {
        final int[] nums = { 1, 0, 1 };
        final int[] expected = { 1, 1, 0 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(4)
    public void testAllZeroes() {
        final int[] nums = { 0, 0, 0, 0 };
        final int[] expected = { 0, 0, 0, 0 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(5)
    public void testNoZeroes() {
        final int[] nums = { 1, 2, 3, 4, 5 };
        final int[] expected = { 1, 2, 3, 4, 5 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(6)
    public void testMixedNumbers() {
        final int[] nums = { 0, 2, 0, 4, 6, 0, 7 };
        final int[] expected = { 2, 4, 6, 7, 0, 0, 0 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(7)
    public void testSingleElement() {
        final int[] nums = { 5 };
        final int[] expected = { 5 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }

    @Test
    @Order(8)
    public void testTwoZerosAndOnes() {
        final int[] nums = { 0, 1, 0, 1 };
        final int[] expected = { 1, 1, 0, 0 };
        MoveZeroes.solution(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
