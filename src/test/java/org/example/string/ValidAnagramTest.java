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
class ValidAnagramTest {

    // Test case 1: Identical strings
    @Test
    @Order(1)
    void testIdenticalStrings() {
        Assertions.assertTrue(ValidAnagram.solution("listen", "listen"));
        Assertions.assertTrue(ValidAnagram.naiveSolution("listen", "listen"));
    }

    // Test case 2: Anagrams with different character order
    @Test
    @Order(2)
    void testAnagrams() {
        Assertions.assertTrue(ValidAnagram.solution("listen", "silent"));
        Assertions.assertTrue(ValidAnagram.naiveSolution("listen", "silent"));
    }

    // Test case 3: Strings of different lengths
    @Test
    @Order(3)
    void testDifferentLengths() {
        Assertions.assertFalse(ValidAnagram.solution("listen", "listens"));
        Assertions.assertFalse(ValidAnagram.naiveSolution("listen", "listens"));
    }

    // Test case 4: Completely different strings
    @Test
    @Order(4)
    void testCompletelyDifferentStrings() {
        Assertions.assertFalse(ValidAnagram.solution("abc", "def"));
        Assertions.assertFalse(ValidAnagram.naiveSolution("abc", "def"));
    }

    // Test case 5: Strings with same characters but different frequencies
    @Test
    @Order(5)
    void testDifferentCharacterFrequencies() {
        Assertions.assertFalse(ValidAnagram.solution("aabbcc", "abc"));
        Assertions.assertFalse(ValidAnagram.naiveSolution("aabbcc", "abc"));
    }

    // Test case 6: Anagrams with repeated characters
    @Test
    @Order(6)
    void testAnagramsWithRepeatedCharacters() {
        Assertions.assertTrue(ValidAnagram.solution("aabbcc", "baccab"));
        Assertions.assertTrue(ValidAnagram.naiveSolution("aabbcc", "baccab"));
    }

    // Test case 7: Empty strings
    @Test
    @Order(7)
    void testEmptyStrings() {
        Assertions.assertTrue(ValidAnagram.solution("", ""));
        Assertions.assertTrue(ValidAnagram.naiveSolution("", ""));
    }

    // Test case 8: One empty string and one non-empty string
    @Test
    @Order(8)
    void testOneEmptyString() {
        Assertions.assertFalse(ValidAnagram.solution("", "a"));
        Assertions.assertFalse(ValidAnagram.naiveSolution("", "a"));
    }

    // Test case 9: Strings with special characters
    @Test
    @Order(9)
    void testStringsWithSpecialCharacters() {
        Assertions.assertTrue(ValidAnagram.solution("!@#$", "$#@!"));
        Assertions.assertTrue(ValidAnagram.naiveSolution("!@#$", "$#@!"));
    }

    // Test case 10: Strings with upper and lower case differences (case-sensitive)
    @Test
    @Order(10)
    void testCaseSensitiveStrings() {
        Assertions.assertFalse(ValidAnagram.solution("Hello", "hello"));
        Assertions.assertFalse(ValidAnagram.naiveSolution("Hello", "hello"));
    }

    // Test case 11: Strings with whitespace characters
    @Test
    @Order(11)
    void testStringsWithWhitespace() {
        Assertions.assertTrue(ValidAnagram.solution("a b c", "c b a"));
        Assertions.assertTrue(ValidAnagram.naiveSolution("a b c", "c b a"));
    }

    // Test case 12: Long strings
    @Test
    @Order(11)
    void testLongStrings() {
        final String s1 = "a".repeat(100000) + "b".repeat(100000) + "c".repeat(100000);
        final String s2 = "c".repeat(100000) + "b".repeat(100000) + "a".repeat(100000);
        Assertions.assertTrue(ValidAnagram.solution(s1, s2));
        Assertions.assertTrue(ValidAnagram.naiveSolution(s1, s2));
    }
}