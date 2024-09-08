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
class SpecialCharactersInStringTest {

    @Test
    @Order(1)
    void testWithMixedCaseLetters() {
        final String word = "aAbBcC";
        final int expected = 3;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(2)
    void testWithNoMatchingPairs() {
        final String word = "abcXYZ";
        final int expected = 0;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(3)
    void testWithDuplicateLetters() {
        final String word = "aAaBbBcCcC";
        final int expected = 3;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(4)
    void testWithUppercaseOnly() {
        final String word = "ABC";
        final int expected = 0;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(5)
    void testWithLowercaseOnly() {
        final String word = "abc";
        final int expected = 0;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(6)
    void testWithEmptyString() {
        final String word = "";
        final int expected = 0;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(7)
    void testWithSpecialCharacters() {
        final String word = "@aA#bBc!";
        final int expected = 2;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(8)
    void testWithSingleCharacter() {
        final String word = "a";
        final int expected = 0;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }

    @Test
    @Order(9)
    void testWithAllSpecialPairs() {
        final String word = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int expected = 26;
        Assertions.assertEquals(expected, SpecialCharactersInString.solution(word));
    }
}
