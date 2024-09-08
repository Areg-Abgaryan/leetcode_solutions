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
class IsFascinatingNumberTest {

    @Test
    @Order(1)
    void testSimpleCase() {
        final int num = 192;
        Assertions.assertTrue(IsFascinatingNumber.solution(num));
    }

    @Test
    @Order(2)
    void testWithZeroDigit() {
        final int num = 101;
        Assertions.assertFalse(IsFascinatingNumber.solution(num));
    }

    @Test
    @Order(3)
    void testGreaterThan333() {
        final int n = 334;
        Assertions.assertFalse(IsFascinatingNumber.solution(n));
    }

    @Test
    @Order(4)
    void testEndsWithZero() {
        final int n = 190;
        Assertions.assertFalse(IsFascinatingNumber.solution(n));
    }

    @Test
    @Order(5)
    void testNotNineDigits() {
        final int n = 123;
        Assertions.assertFalse(IsFascinatingNumber.solution(n));
    }

    @Test
    @Order(6)
    void testDuplicateDigit() {
        final int n = 111;
        Assertions.assertFalse(IsFascinatingNumber.solution(n));
    }

    @Test
    @Order(7)
    void testContainsZero() {
        final int n = 105;
        Assertions.assertFalse(IsFascinatingNumber.solution(n));
    }
}
