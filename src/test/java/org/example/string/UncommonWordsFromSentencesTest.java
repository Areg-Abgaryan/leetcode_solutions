/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class UncommonWordsFromSentencesTest {

    @Test
    void testOneUncommon() {
        final String s1 = "this apple is sweet", s2 = "this apple is sour";
        final String[] expected = { "sweet", "sour" };

        final String[] result = UncommonWordsFromSentences.solution(s1, s2);

        Arrays.sort(result);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testTwoUncommons() {
        final String s1 = "apple apple", s2 = "banana";
        final String[] expected = { "banana" };

        final String[] result = UncommonWordsFromSentences.solution(s1, s2);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testEmptySentenceFirst() {
        final String s1 = "", s2 = "banana orange";
        final String[] expected = { "banana", "orange" };

        final String[] result = UncommonWordsFromSentences.solution(s1, s2);

        Arrays.sort(result);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testEmptySentenceSecond() {
        final String s1 = "apple orange", s2 = "";
        final String[] expected = { "apple", "orange" };

        final String[] result = UncommonWordsFromSentences.solution(s1, s2);
        Arrays.sort(result);
        Arrays.sort(expected);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testNoUncommonWords() {
        final String s1 = "apple banana", s2 = "apple banana";
        final String[] expected = {};

        final String[] result = UncommonWordsFromSentences.solution(s1, s2);

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSingleUncommonWord() {
        final String s1 = "apple";
        final String s2 = "banana";
        final String[] expected = { "apple", "banana" };

        final String[] result = UncommonWordsFromSentences.solution(s1, s2);
        Arrays.sort(result);
        Arrays.sort(expected);

        Assertions.assertArrayEquals(expected, result);
    }
}
