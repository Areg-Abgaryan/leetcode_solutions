/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SecondLargestDigitTest {

    @Test
    @Order(1)
    void testWithValidDigits() {
        final String str = "sjhtz8344";
        final int expected = 4;
        Assertions.assertEquals(expected, SecondLargestDigit.solution(str));
    }

    @Test
    @Order(2)
    void testWithSingleDigit() {
        final String str = "abc1def";
        final int expected = -1;
        Assertions.assertEquals(expected, SecondLargestDigit.solution(str));
    }

    @Test
    @Order(3)
    void testWithNoDigits() {
        final String str = "abcdef";
        final int expected = -1;
        Assertions.assertEquals(expected, SecondLargestDigit.solution(str));
    }

    @Test
    @Order(4)
    void testWithDuplicateDigits() {
        final String str = "1222334";
        final int expected = 3;
        Assertions.assertEquals(expected, SecondLargestDigit.solution(str));
    }

    @Test
    @Order(5)
    void testWithAllSameDigits() {
        final String str = "5555555";
        final int expected = -1;
        Assertions.assertEquals(expected, SecondLargestDigit.solution(str));
    }

    @Test
    @Order(6)
    void testWithEdgeCases() {
        final String str1 = "";
        final int expected1 = -1;
        Assertions.assertEquals(expected1, SecondLargestDigit.solution(str1));

        final String str2 = "abc!@#";
        final int expected2 = -1;
        Assertions.assertEquals(expected2, SecondLargestDigit.solution(str2));
    }

    @Test
    @Order(7)
    void testMax2InTheEnd() {
        final String str = "sjhtz8344";
        final int expected = 4;
        Assertions.assertEquals(expected, SecondLargestDigit.solution(str));
    }

}
