/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReverseStringTest {

    @Test
    @Order(1)
    void testReverseSimpleString() {
        final char[] input1 = { 'h', 'e', 'l', 'l', 'o' };
        final char[] input2 = { 'h', 'e', 'l', 'l', 'o' };
        final char[] expected = { 'o', 'l', 'l', 'e', 'h' };

        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }

    @Test
    @Order(2)
    void testReverseEvenLengthString() {
        final char[] input1 = { 'a', 'b', 'c', 'd' };
        final char[] input2 = { 'a', 'b', 'c', 'd' };
        final char[] expected = { 'd', 'c', 'b', 'a' };

        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }

    @Test
    @Order(3)
    void testSingleCharacter() {
        final char[] input1 = { 'a' }, input2 = { 'a' }, expected = { 'a' };
        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }

    @Test
    @Order(4)
    void testEmptyString() {
        final char[] input1 = { }, input2 = { }, expected = { };
        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }

    @Test
    @Order(5)
    void testPalindrome() {
        final char[] input1 = { 'm', 'a', 'd', 'a', 'm' };
        final char[] input2 = { 'm', 'a', 'd', 'a', 'm' };
        final char[] expected = { 'm', 'a', 'd', 'a', 'm' };
        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }

    @Test
    @Order(6)
    void testStringWithSpaces() {
        final char[] input1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
        final char[] input2 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
        final char[] expected = { 'd', 'l', 'r', 'o', 'w', ' ', 'o', 'l', 'l', 'e', 'h' };
        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }

    @Test
    @Order(7)
    void testStringWithSpecialCharacters() {
        final char[] input1 = { '!', 'a', 'b', '@', '#' };
        final char[] input2 = { '!', 'a', 'b', '@', '#' };
        final char[] expected = { '#', '@', 'b', 'a', '!' };
        ReverseString.solution(input1);
        ReverseString.recursiveSolution(input2);
        assertArrayEquals(expected, input1);
        assertArrayEquals(expected, input2);
    }
}
