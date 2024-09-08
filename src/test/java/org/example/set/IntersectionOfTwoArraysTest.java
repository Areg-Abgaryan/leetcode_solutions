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
class IntersectionOfTwoArraysTest {

    @Test
    @Order(1)
    void testEmptyArrays() {
        final int[] nums1 = {};
        final int[] nums2 = {};
        final int[] expected = {};
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(2)
    void testNoIntersection() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 4, 5, 6 };
        final int[] expected = {};
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(3)
    void testCompleteIntersection() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 1, 2, 3 };
        final int[] expected = { 1, 2, 3 };
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(4)
    void testPartialIntersection() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 4, 5, 6};
        int[] expected = {3, 4};
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(5)
    void testIntersectionWithDuplicates() {
        final int[] nums1 = { 1, 2, 2, 3 };
        final int[] nums2 = { 2, 2, 3, 4 };
        final int[] expected = { 2, 3 };
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(6)
    void testIntersectionWithSingleElement() {
        final int[] nums1 = { 1 };
        final int[] nums2 = { 1 };
        final int[] expected = { 1 };
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(7)
    void testIntersectionWithNoCommonElements() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 4, 5, 6 };
        final int[] expected = {};
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(8)
    void testDifferentSizedArrays() {
        final int[] nums1 = { 1, 2, 3, 4, 5 };
        final int[] nums2 = { 3, 4 };
        final int[] expected = { 3, 4 };
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }

    @Test
    @Order(9)
    void testIntersectionWithNegativeNumbers() {
        final int[] nums1 = { -1, -2, -3, 4 };
        final int[] nums2 = { 4, -1, -3, 5 };
        final int[] expected = { -1, -3, 4 };
        Assertions.assertArrayEquals(expected, IntersectionOfTwoArrays.solution(nums1, nums2));
    }
}
