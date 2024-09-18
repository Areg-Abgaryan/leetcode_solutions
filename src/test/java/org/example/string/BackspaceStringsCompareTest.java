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
class BackspaceStringsCompareTest {

    @Test
    @Order(1)
    void testExample1() {
        final String s = "ab#c", t = "ad#c";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(2)
    void testExample2() {
        final String s = "ab##", t = "c#d#";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(3)
    void testExample3() {
        final String s = "a#c", t = "b";
        Assertions.assertFalse(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(4)
    void testEmptyStrings() {
        final String s = "", t = "";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(5)
    void testSingleBackspace() {
        final String s = "#", t = "";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(6)
    void testMultipleBackspaces() {
        final String s = "a###b", t = "b";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(7)
    void testNoBackspaces() {
        final String s = "abc", t = "abc";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(8)
    void testOnlyBackspaces() {
        final String s = "######", t = "####";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(9)
    void testLongStringsWithBackspaces() {
        final String s = "abc#d##e#f###g", t = "g";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }

    @Test
    @Order(10)
    void testLongExample() {
        final String s = "gtc#uz#", t = "gtcm##uz#";
        Assertions.assertTrue(BackspaceStringsCompare.solution(s, t));
    }
}
