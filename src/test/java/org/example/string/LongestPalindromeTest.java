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
class LongestPalindromeTest {

    @Test
    @Order(1)
    void testAllEvenCounts() {
        final String input = "aabbcc";
        final int expected = 6;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(2)
    void testAllOddCounts() {
        final String input = "abc";
        final int expected = 1;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(3)
    void testMixedCounts() {
        final String input = "aabbccc";
        final int expected = 7;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(4)
    void testSingleCharacter() {
        final String input = "a";
        final int expected = 1;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(5)
    void testEmptyString() {
        final String input = "";
        final int expected = 0;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(6)
    void testLongString() {
        final String input = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        final int expected = 983;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(7)
    void testRepeatedSingleCharacter() {
        final String input = "aaaa";
        final int expected = 4;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }

    @Test
    @Order(8)
    void testSingleOddCount() {
        final String input = "aabbc";
        final int expected = 5;
        Assertions.assertEquals(expected, LongestPalindrome.solution(input));
    }
}
