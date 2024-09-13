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
class IsSubsequenceTest {

    @Test
    @Order(1)
    void testIsSubsequenceTrue() {
        final String candidate = "abc", str = "ahbgdc";
        Assertions.assertTrue(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(2)
    void testIsSubsequenceFalse() {
        final String candidate = "axc", str = "ahbgdc";
        Assertions.assertFalse(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(3)
    void testEmptyCandidate() {
        final String candidate = "", str = "ahbgdc";
        Assertions.assertTrue(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(4)
    void testEmptyString() {
        final String candidate = "abc", str = "";
        Assertions.assertFalse(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(5)
    void testBothEmpty() {
        final String candidate = "", str = "";
        Assertions.assertTrue(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(6)
    void testSingleCharacterInCandidate() {
        final String candidate = "a", str = "ahbgdc";
        Assertions.assertTrue(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(7)
    void testRepeatingCharactersInString() {
        final String candidate = "abc", str = "aaaaaabbbbbbcccccc";
        Assertions.assertTrue(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(8)
    void testIdenticalStrings() {
        final String candidate = "abcdef", str = "abcdef";
        Assertions.assertTrue(IsSubsequence.solution(candidate, str));
    }

    @Test
    @Order(9)
    void testCharactersNotInString() {
        final String candidate = "xyz", str = "ahbgdc";
        Assertions.assertFalse(IsSubsequence.solution(candidate, str));
    }
}
