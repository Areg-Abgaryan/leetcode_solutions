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
class PalindromeNumberTest {

    @Test
    @Order(1)
    void testNegativeCase() {
        Assertions.assertFalse(PalindromeNumber.solution(12));
    }

    @Test
    @Order(2)
    void testPositiveCase() {
        Assertions.assertTrue(PalindromeNumber.solution(71517));
    }

    @Test
    @Order(3)
    void testNegativeNumberCase() {
        Assertions.assertFalse(PalindromeNumber.solution(-587));
    }
}
