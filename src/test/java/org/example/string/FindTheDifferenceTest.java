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
class FindTheDifferenceTest {

    @Test
    @Order(1)
    void testFindDifference1() {
        final String shortStr = "abcd", longStr = "abcde";
        final char expected = 'e';
        Assertions.assertEquals(expected, FindTheDifference.solution(shortStr, longStr));
    }

    @Test
    @Order(2)
    void testFindDifference2() {
        final String shortStr = "", longStr = "y";
        final char expected = 'y';
        Assertions.assertEquals(expected, FindTheDifference.solution(shortStr, longStr));
    }

    @Test
    @Order(3)
    void testFindDifference3() {
        final String shortStr = "xyz", longStr = "zyxa";
        final char expected = 'a';
        Assertions.assertEquals(expected, FindTheDifference.solution(shortStr, longStr));
    }

    @Test
    @Order(4)
    void testFindDifference4() {
        final String shortStr = "aaabb", longStr = "baaaba";
        final char expected = 'a';
        Assertions.assertEquals(expected, FindTheDifference.solution(shortStr, longStr));
    }

    @Test
    @Order(5)
    void testFindDifference5() {
        final String shortStr = "hello", longStr = "lheolx";
        final char expected = 'x';
        Assertions.assertEquals(expected, FindTheDifference.solution(shortStr, longStr));
    }
}
