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
class IsomorphicStringsTest {

    @Test
    @Order(1)
    void testIsomorphicEggAdd() {
        final String s = "egg";
        final String t = "add";
        Assertions.assertTrue(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(2)
    void testIsomorphicFooBar() {
        final String s = "foo";
        final String t = "bar";
        Assertions.assertFalse(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(3)
    void testIsomorphicEmptyStrings() {
        final String s = "";
        final String t = "";
        Assertions.assertFalse(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(4)
    void testIsomorphicSingleCharacters() {
        final String s = "a";
        final String t = "b";
        Assertions.assertTrue(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(5)
    void testIsomorphicDifferentLengths() {
        final String s = "abcd";
        final String t = "abc";
        Assertions.assertFalse(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(6)
    void testIsomorphicRepeatingCharacters() {
        final String s = "abba";
        final String t = "abab";
        Assertions.assertFalse(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(7)
    void testIsomorphicNumbersIncluded() {
        final String s = "123";
        final String t = "234";
        Assertions.assertTrue(IsomorphicStrings.solution(s, t));
    }

    @Test
    @Order(8)
    void testContainsSameValue() {
        final String s = "badc";
        final String t = "baba";
        Assertions.assertFalse(IsomorphicStrings.solution(s, t));
    }
}
