/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Arrays;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    @Test
    @Order(1)
    void testThree() {
        final int n = 3;
        final List<String> expected = Arrays.asList("1", "2", "Fizz");
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }

    @Test
    @Order(2)
    void testFive() {
        final int n = 5;
        final List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }

    @Test
    @Order(3)
    void testFifteen() {
        final int n = 15;
        final List<String> expected = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        );
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }

    @Test
    @Order(4)
    void testForMultipleOfThree() {
        final int n = 6;
        final List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz");
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }

    @Test
    @Order(5)
    void testForMultipleOfFive() {
        int n = 10;
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz");
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }

    @Test
    @Order(6)
    void testForMultipleOfFifteen() {
        final int n = 30;
        final List<String> expected = Arrays.asList(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
                "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz"
        );
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }

    @Test
    @Order(7)
    void testEdgeCase() {
        final int n = 1;
        final List<String> expected = List.of("1");
        Assertions.assertEquals(expected, FizzBuzz.solution(n));
    }
}
