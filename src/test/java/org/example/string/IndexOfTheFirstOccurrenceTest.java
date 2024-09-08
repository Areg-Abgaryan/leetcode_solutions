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
class IndexOfTheFirstOccurrenceTest {

    @Test
    @Order(1)
    void testFirstOccurrence() {
        final String haystack = "sadbutsad", needle = "sad";
        final int expected = 0;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(2)
    void testNoOccurrence() {
        final String haystack = "leetcode", needle = "leeto";
        final int expected = -1;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(3)
    void testEmptyNeedle() {
        final String haystack = "hello", needle = "";
        final int expected = 0;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(4)
    void testNeedleAtEnd() {
        final String haystack = "helloworld", needle = "world";
        final int expected = 5;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(5)
    void testSingleCharacterNeedle() {
        final String haystack = "mississippi", needle = "i";
        final int expected = 1;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(6)
    void testNeedleLongerThanHaystack() {
        final String haystack = "short", needle = "longneedle";
        final int expected = -1;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(7)
    void testNeedleEqualToHaystack() {
        final String haystack = "match", needle = "match";
        final int expected = 0;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(8)
    void testNeedleWithSpecialCharacters() {
        final String haystack = "hello$world!", needle = "$world";
        final int expected = 5;
         Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }

    @Test
    @Order(9)
    void testConfusingNeedleInTheMiddle() {
        final String haystack = "mississippi!", needle = "issip";
        final int expected = 4;
        Assertions.assertEquals(expected, IndexOfTheFirstOccurrence.solution(haystack, needle));
    }
}
