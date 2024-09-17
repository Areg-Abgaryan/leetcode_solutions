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
class GoatLatinTest {

    @Test
    @Order(1)
    void testExample() {
        final String input = "I speak Goat Latin";
        final String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(2)
    void testLongerExample() {
        final String input = "The quick brown fox jumped over the lazy dog";
        final String expected = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(3)
    void testEmptyString() {
        final String input = "", expected = "";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(4)
    void testSingleVowelWord() {
        final String input = "apple", expected = "applemaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(5)
    void testSingleConsonantWord() {
        final String input = "goat", expected = "oatgmaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(6)
    void testMultipleVowels() {
        final String input = "ocean apple igloo", expected = "oceanmaa applemaaa igloomaaaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(7)
    void testMixedCaseWords() {
        final String input = "Apple Speak Goat", expected = "Applemaa peakSmaaa oatGmaaaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }

    @Test
    @Order(8)
    void testSingleWordSentence() {
        final String input = "Goat", expected = "oatGmaa";
        Assertions.assertEquals(expected, GoatLatin.solution(input));
    }
}
