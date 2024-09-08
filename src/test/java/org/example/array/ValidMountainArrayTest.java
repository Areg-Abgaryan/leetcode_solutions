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
class ValidMountainArrayTest {

    @Test
    @Order(1)
    void testNotEnoughElements() {
        final int[] arr = { 2, 1 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(2)
    void testFlatTop() {
        final int[] arr = { 3, 5, 5 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(3)
    void testValidMountain() {
        final int[] arr = { 0, 3, 2, 1 };
        Assertions.assertTrue(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(4)
    void testOnlyIncreasing() {
        final int[] arr = { 1, 2, 3, 4, 5 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(5)
    void testOnlyDecreasing() {
        final int[] arr = { 5, 4, 3, 2, 1 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(6)
    void testPeakAtStart() {
        final int[] arr = { 3, 2, 1 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(7)
    void testPeakAtEnd() {
        final int[] arr = { 1, 2, 3 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(8)
    void testValidMountainWithMoreElements() {
        final int[] arr = { 1, 3, 6, 7, 4, 2, 0 };
        Assertions.assertTrue(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(9)
    void testLongFlatAfterPeak() {
        final int[] arr = { 1, 2, 3, 4, 4, 4, 3, 2 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(10)
    void testArrayWithSinglePeak() {
        final int[] arr = { 0, 10, 5 };
        Assertions.assertTrue(ValidMountainArray.solution(arr));
    }

    @Test
    @Order(11)
    void testArrayWithSingleElement() {
        final int[] arr = { 2 };
        Assertions.assertFalse(ValidMountainArray.solution(arr));
    }
}
