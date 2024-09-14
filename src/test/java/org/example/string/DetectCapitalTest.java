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
class DetectCapitalTest {

    @Test
    @Order(1)
    void testAllUppercase() {
        final String word = "USA";
        Assertions.assertTrue(DetectCapital.solution(word));
    }

    @Test
    @Order(2)
    void testAllLowercase() {
        final String word = "leetcode";
        Assertions.assertTrue(DetectCapital.solution(word));
    }

    @Test
    @Order(3)
    void testOnlyFirstLetterUppercase() {
        final String word = "Google";
        Assertions.assertTrue(DetectCapital.solution(word));
    }

    @Test
    @Order(4)
    void testMixedCapitalization() {
        final String word = "FlaG";
        Assertions.assertFalse(DetectCapital.solution(word));
    }

    @Test
    @Order(5)
    void testSingleUppercaseLetter() {
        final String word = "A";
        Assertions.assertTrue(DetectCapital.solution(word));
    }

    @Test
    @Order(6)
    void testSingleLowercaseLetter() {
        final String word = "a";
        Assertions.assertTrue(DetectCapital.solution(word));
    }

    @Test
    @Order(7)
    void testEmptyString() {
        final String word = "";
        Assertions.assertTrue(DetectCapital.solution(word));
    }

    @Test
    @Order(8)
    void testNullString() {
        Assertions.assertTrue(DetectCapital.solution(null));
    }
}