/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TwoSumTest {

    @Test
    @Order(1)
    void testEmptyArray() {
        final int[] nums = {};
        final int target = 0;
        Assertions.assertNull(TwoSum.solution(nums, target));
        Assertions.assertNull(TwoSum.naiveSolution(nums, target));
    }

    @Test
    @Order(2)
    void testArrayWithOneElement() {
        final int[] nums = { 1 };
        final int target = 2;
        Assertions.assertNull(TwoSum.solution(nums, target));
        Assertions.assertNull(TwoSum.naiveSolution(nums, target));
    }

    @Test
    @Order(3)
    void testTargetFound() {

        //  Case 1
        int[] expectedValue = new int[] { 0, 1 };
        int[] nums = { 3, 3 };
        int target = 6;

        int[] solutionActual = TwoSum.solution(nums, target);
        int[] solutionNaive = TwoSum.naiveSolution(nums, target);
        assert solutionActual != null;
        assert solutionNaive != null;
        Arrays.sort(solutionActual);
        Arrays.sort(solutionNaive);

        Assertions.assertArrayEquals(expectedValue, solutionActual);
        Assertions.assertArrayEquals(expectedValue, solutionNaive);

        //  Case 2
        expectedValue = new int[]{ 1, 2 };
        nums = new int[]{ 11, 7, 2, 15 };
        target = 9;

        solutionActual = TwoSum.solution(nums, target);
        solutionNaive = TwoSum.naiveSolution(nums, target);
        assert solutionActual != null;
        assert solutionNaive != null;
        Arrays.sort(solutionActual);
        Arrays.sort(solutionNaive);

        Assertions.assertArrayEquals(expectedValue, solutionActual);
        Assertions.assertArrayEquals(expectedValue, solutionNaive);
    }
}
