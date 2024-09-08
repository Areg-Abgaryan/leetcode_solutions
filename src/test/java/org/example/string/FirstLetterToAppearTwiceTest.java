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
class FirstLetterToAppearTwiceTest {

    @Test
    @Order(1)
    void testExampleCase() {
        final String s = "abca";
        final char expected = 'a';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }

    @Test
    @Order(2)
    void testSingleCharacterString() {
        final String s = "a";
        final char expected = ' ';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }

    @Test
    @Order(3)
    void testNoRepeatedCharacter() {
        final String s = "abcdefg";
        final char expected = ' ';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }

    @Test
    @Order(4)
    void testFirstRepeatedCharacterInMiddle() {
        String s = "abcdefga";
        char expected = 'a';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }

    @Test
    @Order(5)
    void testAllCharactersRepeated() {
        final String s = "aabbcc";
        final char expected = 'a';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }

    @Test
    @Order(6)
    void testLastCharacterIsFirstRepeated() {
        final String s = "abcdeff";
        final char expected = 'f';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }

    @Test
    @Order(7)
    void testEmptyString() {
        final String s = "";
        final char expected = ' ';
        Assertions.assertEquals(expected, FirstLetterToAppearTwice.solution(s));
    }
}
