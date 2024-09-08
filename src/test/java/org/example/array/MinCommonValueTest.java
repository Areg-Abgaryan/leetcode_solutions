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
class MinCommonValueTest {

    @Test
    @Order(1)
    void testEmptyArrays() {
        final int[] nums1 = { };
        final int[] nums2 = { };
        Assertions.assertEquals(-1, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(2)
    void testOneEmptyArray() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { };
        Assertions.assertEquals(-1, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(3)
    void testNoCommonValue() {
        final int[] nums1 = { 1, 2, 3, 4, 5 };
        final int[] nums2 = { 6, 7, 8, 9, 10 };
        Assertions.assertEquals(-1, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(4)
    void testCommonValueAtBeginning() {
        final int[] nums1 = { 1, 2, 3, 4, 5 };
        final int[] nums2 = { 1, 6, 7, 8, 9 };
        Assertions.assertEquals(1, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(5)
    void testCommonValueInMiddle() {
        final int[] nums1 = { 1, 2, 3, 4, 5 };
        final int[] nums2 = { 0, 2, 6, 7, 8 };
        Assertions.assertEquals(2, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(6)
    void testCommonValueAtEnd() {
        final int[] nums1 = { 1, 3, 5, 7, 9 };
        final int[] nums2 = { 2, 4, 6, 8, 9 };
        Assertions.assertEquals(9, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(7)
    void testCommonValueWithDuplicates() {
        final int[] nums1 = { 1, 2, 2, 2, 3 };
        final int[] nums2 = { 2, 2, 2, 2, 4 };
        Assertions.assertEquals(2, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(8)
    void testNegativeNumbers() {
        final int[] nums1 = { -5, -3, 0, 2, 4 };
        final int[] nums2 = { -4, -3, 3, 5, 6 };
        Assertions.assertEquals(-3, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(9)
    void testDifferentNumberOfElements() {
        final int[] nums1 = { 1, 3, 5, 7, 9 };
        final int[] nums2 = { 3, 5, 7 };
        Assertions.assertEquals(3, MinCommonValue.solution(nums1, nums2));
    }

    @Test
    @Order(10)
    void testDifferentNumberOfElementsNoCommon() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 4, 5, 6, 7, 8, 9, 10 };
        Assertions.assertEquals(-1, MinCommonValue.solution(nums1, nums2));
    }
}
