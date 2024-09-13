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
class LengthOfLastWordTest {

    @Test
    @Order(1)
    void testSimpleCase() {
        final String str = "Hello World";
        final int expected = 5;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(2)
    void testTrailingSpaces() {
        final String str = "   fly me   to   the moon  ";
        final int expected = 4;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(3)
    void testMultipleWords() {
        final String str = "luffy is still joyboy";
        final int expected = 6;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(4)
    void testEmptyString() {
        final String str = "";
        final int expected = 0;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(5)
    void testOnlySpaces() {
        final String str = "";
        final int expected = 0;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(6)
    void testSingleWord() {
        final String str = "test";
        final int expected = 4;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(7)
    void testSingleWordWithSpaces() {
        final String str = "   test   ";
        final int expected = 4;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }

    @Test
    @Order(8)
    void testNullString() {
        final String str = null;
        final int expected = 0;
        Assertions.assertEquals(expected, LengthOfLastWord.solution(str));
    }
}
