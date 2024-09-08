/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.stream.IntStream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MajorityElementTest {

    @Test
    @Order(1)
    void testMajorityElementExample1() {
        final int[] nums = { 3, 2, 3 };
        final int expected = 3;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }

    @Test
    @Order(2)
    void testMajorityElementExample2() {
        final int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        final int expected = 2;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }

    @Test
    @Order(3)
    void testMajorityElementSingleElement() {
        final int[] nums = { 5 };
        final int expected = 5;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }

    @Test
    @Order(4)
    void testMajorityElementAllSame() {
        final int[] nums = { 7, 7, 7, 7, 7 };
        final int expected = 7;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }

    @Test
    @Order(5)
    void testMajorityElementMixedNumbers() {
        final int[] nums = { 1, 2, 2, 3, 2, 4, 2 };
        final int expected = 2;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }

    @Test
    @Order(6)
    void testMajorityElementNegativeNumbers() {
        final int[] nums = { -1, -1, -1, -2, -2 };
        final int expected = -1;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }

    @Test
    @Order(7)
    void testMajorityElementLargeInput() {
        final int[] nums = IntStream.range(0, 1000).map(i -> 5).toArray();
        final int expected = 5;
        Assertions.assertEquals(expected, MajorityElement.solution(nums));
    }
}
