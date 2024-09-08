/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MissingNumberTest {

    // Test case 1: A missing number in the middle of the array
    @Test
    @Order(1)
    void testMissingNumberInMiddle() {
        final int[] nums = {0, 1, 3, 4, 5};
        Assertions.assertEquals(2, MissingNumber.solution(nums));
        Assertions.assertEquals(2, MissingNumber.naiveSolution(nums));
    }

    // Test case 2: The first element is missing
    @Test
    @Order(2)
    void testMissingFirstElement() {
        final int[] nums = {1, 2, 3, 4, 5};
        Assertions.assertEquals(0, MissingNumber.solution(nums));
        Assertions.assertEquals(0, MissingNumber.naiveSolution(nums));
    }

    // Test case 3: The last element is missing
    @Test
    @Order(3)
    void testMissingLastElement() {
        final int[] nums = {0, 1, 2, 3, 4};
        Assertions.assertEquals(5, MissingNumber.solution(nums));
        Assertions.assertEquals(5, MissingNumber.naiveSolution(nums));
    }

    // Test case 4: Only one element, which is missing (e.g., array is empty)
    @Test
    @Order(4)
    void testSingleElementMissing() {
        final int[] nums = {};
        Assertions.assertEquals(0, MissingNumber.solution(nums));
        Assertions.assertEquals(0, MissingNumber.naiveSolution(nums));
    }

    // Test case 5: Random missing number
    @Test
    @Order(5)
    void testRandomMissingNumber() {
        final int[] nums = { 3, 0, 1, 4 };
        Assertions.assertEquals(2, MissingNumber.solution(nums));
        Assertions.assertEquals(2, MissingNumber.naiveSolution(nums));
    }

    // Test case 6: Large array with a missing number
    @Test
    @Order(6)
    void testLargeArrayMissingNumber() {
        final int size = 1000;
        final int missingNumber = 567;
        final int[] nums = new int[size - 1];

        for (int i = 0, j = 0; i < size; ++i) {
            if (i == missingNumber) continue;
            nums[j++] = i;
        }

        Assertions.assertEquals(missingNumber, MissingNumber.solution(nums));
        Assertions.assertEquals(missingNumber, MissingNumber.naiveSolution(nums));
    }

    // Test case 7: The array contains only one element, and the element is not missing
    @Test
    @Order(7)
    void testSingleElementNotMissing() {
        final int[] nums = { 0 };
        Assertions.assertEquals(1, MissingNumber.solution(nums));
        Assertions.assertEquals(1, MissingNumber.naiveSolution(nums));
    }
}
