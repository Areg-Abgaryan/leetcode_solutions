/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountPrimesTest {

    @Test
    @Order(1)
    void testCountPrimesExample() {
        final int n = 10;
        final int expected = 4;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(2)
    void testCountPrimesInputIsZero() {
        final int n = 0;
        final int expected = 0;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(3)
    void testCountPrimesInputIsOne() {
        final int n = 1;
        final int expected = 0;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(4)
    void testCountPrimesSmallPrimeNumber() {
        final int n = 5;
        final int expected = 2;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(5)
    void testCountPrimesLargeNumber() {
        final int n = 100;
        final int expected = 25;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(6)
    void testCountPrimesPrimeAsInput() {
        final int n = 11;
        final int expected = 4;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(7)
    void testCountPrimesLargeInput() {
        final int n = 1000;
        final int expected = 168;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }

    @Test
    @Order(8)
    void testCountPrimesVeryLargeInput() {
        final int n = 5000000;
        final int expected = 348513;
        Assertions.assertEquals(expected, CountPrimes.naiveSolution(n));
        Assertions.assertEquals(expected, CountPrimes.solution(n));
    }
}
