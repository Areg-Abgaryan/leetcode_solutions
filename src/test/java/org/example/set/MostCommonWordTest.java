/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MostCommonWordTest {

    @Test
    @Order(1)
    void testOneBannedWord() {
        final String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        final String[] banned = { "hit" };
        final String expected = "ball";
        final String result = MostCommonWord.solution(paragraph, banned);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Order(2)
    void testSmallSentence() {
        final String paragraph = "a.";
        final String[] banned = {};
        final String expected = "a";
        final String result = MostCommonWord.solution(paragraph, banned);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Order(3)
    void testSingleWordParagraph() {
        final String paragraph = "hello";
        final String[] banned = { "hi" };
        final String expected = "hello";
        final String result = MostCommonWord.solution(paragraph, banned);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Order(4)
    void testWithPunctuation() {
        final String paragraph = "Wow! The WOW effect was great. wow, wow, wow!";
        final String[] banned = { "wow" };
        final String expected = "the";
        final String result = MostCommonWord.solution(paragraph, banned);
        Assertions.assertEquals(expected, result);
    }
}
