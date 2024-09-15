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
class CountSegmentsTest {


    @Test
    @Order(1)
    void testWithMultipleSegments() {
        final String str = "Hello, my name is John";
        final int expected = 5;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }

    @Test
    @Order(2)
    void testWithSingleWord() {
        final String str = "Hello";
        final int expected = 1;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }

    @Test
    @Order(3)
    void testWithEmptyString() {
        final String str = "";
        final int expected = 0;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }

    @Test
    @Order(4)
    void testWithOnlySpaces() {
        final String str = "      ";
        final int expected = 0;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }

    @Test
    @Order(5)
    void testWithLeadingAndTrailingSpaces() {
        final String str = "  Hello World  ";
        final int expected = 2;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }

    @Test
    @Order(6)
    void testWithMultipleSpacesBetweenWords() {
        final String str = "Hello    World   ";
        final int expected = 2;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }

    @Test
    @Order(7)
    void testWithNullString() {
        final String str = null;
        final int expected = 0;
        Assertions.assertEquals(expected, CountSegments.solution(str));
    }
}
