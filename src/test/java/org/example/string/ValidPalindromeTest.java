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
class ValidPalindromeTest {

    @Test
    @Order(1)
    void testEmptyString() {
        Assertions.assertTrue(ValidPalindrome.solution(""));

    }

    @Test
    @Order(2)
    void testSingleCharacter() {
        Assertions.assertTrue(ValidPalindrome.solution("a"));
    }

    @Test
    @Order(3)
    void testPalindromeAllLetters() {
        Assertions.assertTrue(ValidPalindrome.solution("racecar"));
    }

    @Test
    @Order(4)
    void testPalindromeMixedCase() {
        Assertions.assertTrue(ValidPalindrome.solution("M2ada2m"));
    }

    @Test
    @Order(5)
    void testPalindromeWithNonLetters() {
        Assertions.assertTrue(ValidPalindrome.solution("A man, a plan, a canal, Panama!"));
    }

    @Test
    @Order(6)
    void testNonPalindromeDifferentCharacters() {
        Assertions.assertFalse(ValidPalindrome.solution("hello"));
    }
}
