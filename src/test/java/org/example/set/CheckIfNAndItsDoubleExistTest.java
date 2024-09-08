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
class CheckIfNAndItsDoubleExistTest {

    @Test
    @Order(1)
    void testMatchFound() {
        final int[] nums = { 10, 2, 5, 3 };
        Assertions.assertTrue(CheckIfNAndItsDoubleExist.solution(nums));
    }

    @Test
    @Order(2)
    void testNoMatch() {
        final int[] nums = { 3, 1, 7, 11 };
        Assertions.assertFalse(CheckIfNAndItsDoubleExist.solution(nums));
    }

    @Test
    @Order(3)
    void testNegativeNumbers() {
        final int[] nums = { -2, -1, 0, 1 };
        Assertions.assertTrue(CheckIfNAndItsDoubleExist.solution(nums));
    }

    @Test
    @Order(4)
    void testMatchFoundInTheMiddle() {
        final int[] nums = { 7, 1, 14, 11 };
        Assertions.assertTrue(CheckIfNAndItsDoubleExist.solution(nums));
    }
}
