/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FindAllDisappearedNumbersTest {

    @Test
    @Order(1)
    void testExampleCase() {
        final int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        final List<Integer> expected = Arrays.asList(5, 6);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(2)
    void testNoMissingNumbers() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        final List<Integer> expected = List.of();
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(3)
    void testAllNumbersMissing() {
        final int[] nums = { 9, 9, 9, 9, 9, 9, 9, 9 };
        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(4)
    void testMultipleMissingNumbers() {
        final int[] nums = { 2, 2, 2, 2, 2 };
        final List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(5)
    void testSingleElementArrayMissing() {
        final int[] nums = { 1 };
        final List<Integer> expected = List.of();
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(6)
    void testSingleElementArrayMissingNumber() {
        final int[] nums = { 2 };
        final List<Integer> expected = List.of(1);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(7)
    void testEmptyArray() {
        final int[] nums = {};
        final List<Integer> expected = List.of();
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(8)
    void testLargeArrayWithMultipleMissing() {
        final int[] nums = { 1, 3, 3, 3, 7, 8, 2, 2 };
        final List<Integer> expected = Arrays.asList(4, 5, 6);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(9)
    void testArrayWithDuplicates() {
        final int[] nums = { 3, 3, 3, 3, 3 };
        final List<Integer> expected = Arrays.asList(1, 2, 4, 5);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }

    @Test
    @Order(10)
    void testArrayWithAllElementsSame() {
        final int[] nums = { 2, 2, 2, 2, 2 };
        final List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        Assertions.assertEquals(expected, FindAllDisappearedNumbers.solution(nums));
    }
}
