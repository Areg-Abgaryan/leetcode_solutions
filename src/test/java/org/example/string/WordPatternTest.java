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
class WordPatternTest {

    @Test
    @Order(1)
    void testSimpleCase() {
        final String pattern = "abba", str = "dog cat cat dog";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertTrue(result);
    }

    @Test
    @Order(2)
    void testFalsePattern() {
        final String pattern = "abba", str = "dog cat cat fish";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }

    @Test
    @Order(3)
    void testDifferentLengths() {
        final String pattern = "abba", str = "dog cat cat";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }

    @Test
    @Order(4)
    void testSingleLetterPattern() {
        final String pattern = "a", str = "dog";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertTrue(result);
    }

    @Test
    @Order(5)
    void testRepeatingWords() {
        final String pattern = "aaaa", str = "dog dog dog cat";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }

    @Test
    @Order(6)
    void testRepeatingPattern() {
        final String pattern = "ab", str = "dog dog";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }

    @Test
    @Order(7)
    void testEmptyPatternAndString() {
        final String pattern = "", str = "  ";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertTrue(result);
    }

    @Test
    @Order(8)
    void testEmptyPatternAndNonEmptyString() {
        final String pattern = "", str = "dog";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }

    @Test
    @Order(9)
    void testNonEmptyPatternAndEmptyString() {
        final String pattern = "a", str = "";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }

    @Test
    @Order(10)
    void testViceVersaMatching() {
        final String pattern = "aba", str = "dog cat cat";
        final boolean result = WordPattern.solution(pattern, str);
        Assertions.assertFalse(result);
    }
}
