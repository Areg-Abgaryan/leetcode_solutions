/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContainsDuplicateTest {

    @Test
    @Order(1)
    void testEmptyArray() {
        final int[] nums = { };
        Assertions.assertFalse(ContainsDuplicate.solution(nums));
    }

    @Test
    @Order(2)
    void testSingleElementArray() {
        final int[] nums = { 1 };
        Assertions.assertFalse(ContainsDuplicate.solution(nums));
    }

    @Test
    @Order(3)
    void testNoDuplicates() {
        final int[] nums = { 1, 2, 3, 4, 5 };
        Assertions.assertFalse(ContainsDuplicate.solution(nums));
    }

    @Test
    @Order(4)
    void testWithDuplicates() {
        final int[] nums = { 1, 2, 3, 2 };
        Assertions.assertTrue(ContainsDuplicate.solution(nums));
    }

    @Test
    @Order(5)
    void testArrayWithAllDuplicates() {
        final int[] nums = { 1, 1, 1, 1 };
        Assertions.assertTrue(ContainsDuplicate.solution(nums));
    }

    @Test
    @Order(6)
    void testNegativeNumbers() {
        final int[] nums = { -1, -2, -3, -1 };
        Assertions.assertTrue(ContainsDuplicate.solution(nums));
    }

    @Test
    @Order(7)
    void testMixedNumbers() {
        final int[] nums = { 1, -1, 0, 1 };
        Assertions.assertTrue(ContainsDuplicate.solution(nums));
    }
}
