/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.stream.IntStream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BinarySearchTest {

    // Test case 1: Target is present in the middle of the array
    @Test
    @Order(1)
    void testTargetInMiddle() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7};
        final int target = 4;
        Assertions.assertEquals(3, BinarySearch.solution(nums, target));
    }

    // Test case 2: Target is the first element in the array
    @Test
    @Order(2)
    void testTargetAtStart() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7};
        final int target = 1;
        Assertions.assertEquals(0, BinarySearch.solution(nums, target));
    }

    // Test case 3: Target is the last element in the array
    @Test
    @Order(3)
    void testTargetAtEnd() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7};
        final int target = 7;
        Assertions.assertEquals(6, BinarySearch.solution(nums, target));
    }

    // Test case 4: Target is not present in the array
    @Test
    @Order(4)
    void testTargetNotPresent() {
        final int[] nums = {1, 2, 3, 4, 5, 6, 7};
        final int target = 8;
        Assertions.assertEquals(-1, BinarySearch.solution(nums, target));
    }

    // Test case 5: Array has only one element, target is present
    @Test
    @Order(5)
    void testSingleElementArrayTargetPresent() {
        final int[] nums = {5};
        final int target = 5;
        Assertions.assertEquals(0, BinarySearch.solution(nums, target));
    }

    // Test case 6: Array has only one element, target is not present
    @Test
    @Order(6)
    void testSingleElementArrayTargetAbsent() {
        final int[] nums = {5};
        final int target = 1;
        Assertions.assertEquals(-1, BinarySearch.solution(nums, target));
    }

    // Test case 7: Empty array
    @Test
    @Order(7)
    void testEmptyArray() {
        final int[] nums = {};
        final int target = 1;
        Assertions.assertEquals(-1, BinarySearch.solution(nums, target));
    }

    // Test case 8: Target is in the array with duplicate elements
    @Test
    @Order(8)
    void testArrayWithDuplicates() {
        final int[] nums = {1, 2, 2, 2, 3, 4, 5};
        final int target = 2;
        // Any of the indices 1, 2, or 3 would be correct
        final int result = BinarySearch.solution(nums, target);
        final boolean isCorrect = (result == 1 || result == 2 || result == 3);
        Assertions.assertTrue(isCorrect);
    }

    // Test case 9: Array with negative numbers, target is present
    @Test
    @Order(9)
    void testArrayWithNegativeNumbers() {
        final int[] nums = {-10, -5, 0, 3, 8};
        final int target = -5;
        Assertions.assertEquals(1, BinarySearch.solution(nums, target));
    }

    // Test case 10: Array with all negative numbers, target is not present
    @Test
    @Order(10)
    void testAllNegativeNumbersTargetAbsent() {
        final int[] nums = {-10, -9, -8, -7, -6};
        final int target = 0;
        Assertions.assertEquals(-1, BinarySearch.solution(nums, target));
    }

    // Test case 11: Large array, target is present
    @Test
    @Order(11)
    void testLargeArrayTargetPresent() {
        final int[] nums = IntStream.range(0, 1000).map(i -> i * 2).toArray();
        final int target = 998;
        Assertions.assertEquals(499, BinarySearch.solution(nums, target));
    }

    // Test case 12: Large array, target is not present
    @Test
    @Order(12)
    void testLargeArrayTargetAbsent() {
        final int[] nums = IntStream.range(0, 1000).map(i -> i * 2).toArray();
        final int target = 999;
        Assertions.assertEquals(-1, BinarySearch.solution(nums, target));
    }
}