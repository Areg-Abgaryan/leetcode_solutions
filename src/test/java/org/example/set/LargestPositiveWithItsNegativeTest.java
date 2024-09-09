/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestPositiveWithItsNegativeTest {

    @Test
    public void testCase1() {
        final int[] nums = { -1, 2, -3, 3 };
        final int expected = 3;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase2() {
        final int[] nums = { -1, 10, 6, 7, -7, 1 };
        final int expected = 7;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase3() {
        final int[] nums = { -10, 8, 6, 7, -2, -3 };
        final int expected = -1;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase4() {
        final int[] nums = { 1, -1 };
        final int expected = 1;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase5() {
        final int[] nums = { 5, 10, -5, -10 };
        final int expected = 10;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase6() {
        final int[] nums = { 9, -9, 8, -8, 7, -7 };
        final int expected = 9;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase7() {
        final int[] nums = { 3, 2, -4 };
        final int expected = -1;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }

    @Test
    public void testCase8() {
        final int[] nums = { -1000, 1000, -500, 500, 100 };
        final int expected = 1000;
        Assertions.assertEquals(expected, LargestPositiveWithItsNegative.solution(nums));
    }
}
