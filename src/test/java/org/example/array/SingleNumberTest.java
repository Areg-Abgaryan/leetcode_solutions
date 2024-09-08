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
class SingleNumberTest {

    @Test
    @Order(1)
    void testSingleElement() {
        final int[] nums = { 1 };
        Assertions.assertEquals(1, SingleNumber.solution(nums));
    }

    @Test
    @Order(2)
    void testTwoIdenticalElements() {
        final int[] nums = { 2, 2, 1 };
        Assertions.assertEquals(1, SingleNumber.solution(nums));
    }

    @Test
    @Order(3)
    void testMixedPositiveAndNegative() {
        final int[] nums = { -1, -1, 2, 3, 2 };
        Assertions.assertEquals(3, SingleNumber.solution(nums));
    }

    @Test
    @Order(4)
    void testAllNegativeNumbers() {
        final int[] nums = { -3, -1, -1, -3, -7 };
        Assertions.assertEquals(-7, SingleNumber.solution(nums));
    }

    @Test
    @Order(5)
    void testLargerArray() {
        final int[] nums = { 4, 1, 2, 1, 2, 4, 5 };
        Assertions.assertEquals(5, SingleNumber.solution(nums));
    }

    @Test
    @Order(6)
    void testElementAtBeginning() {
        final int[] nums = { 9, 1, 2, 1, 2 };
        Assertions.assertEquals(9, SingleNumber.solution(nums));
    }

    @Test
    @Order(7)
    void testElementAtEnd() {
        final int[] nums = { 1, 2, 1, 3, 2 };
        Assertions.assertEquals(3, SingleNumber.solution(nums));
    }
}
