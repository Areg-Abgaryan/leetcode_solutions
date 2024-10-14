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
import java.util.stream.IntStream;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RemoveElementTest {

    @Test
    @Order(1)
    void testRemoveElementBasicCase() {
        final int[] nums = { 3, 2, 2, 3 }, expectedNums = { 2, 2 };
        final int val = 3;
        final int result = RemoveElement.solution(nums, val);

        //  Check if k matches the expected length
        Assertions.assertEquals(expectedNums.length, result);

        //  Sort the first k elements of nums to match expectedNums
        Arrays.sort(nums, 0, result);

        //  Verify if the elements match the expected result
        IntStream.range(0, result).forEach(i -> Assertions.assertEquals(expectedNums[i], nums[i]));
    }

    @Test
    @Order(2)
    void testRemoveElementAllValuesSame() {
        final int[] nums = { 4, 4, 4, 4 }, expectedNums = {};
        final int val = 4;
        Assertions.assertEquals(expectedNums.length, RemoveElement.solution(nums, val));
    }

    @Test
    @Order(3)
    void testRemoveElementNoValuesRemoved() {
        final int[] nums = { 1, 2, 3, 4 }, expectedNums = { 1, 2, 3, 4 };
        final int val = 5;
        final int result = RemoveElement.solution(nums, val);
        Assertions.assertEquals(expectedNums.length, result);

        //  Sort the first k elements of nums to match expectedNums
        Arrays.sort(nums, 0, result);

        IntStream.range(0, result).forEach(i -> Assertions.assertEquals(expectedNums[i], nums[i]));
    }
}
