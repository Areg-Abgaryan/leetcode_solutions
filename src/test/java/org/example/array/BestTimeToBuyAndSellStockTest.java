/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BestTimeToBuyAndSellStockTest {

    @Test
    @Order(1)
    void testTypicalCase() {
        final int[] prices = { 7, 1, 5, 3, 6, 4 };
        final int expectedProfit = 5;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }

    @Test
    @Order(2)
    void testNoProfitPossible() {
        final int[] prices = { 7, 6, 4, 3, 1 };
        final int expectedProfit = 0;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }

    @Test
    @Order(3)
    void testSinglePrice() {
        final int[] prices = { 5 };
        final int expectedProfit = 0;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }

    @Test
    @Order(4)
    void testTwoPricesProfitPossible() {
        final int[] prices = { 1, 5 };
        final int expectedProfit = 4;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }

    @Test
    @Order(5)
    void testTwoPricesNoProfit() {
        final int[] prices = { 5, 1 };
        final int expectedProfit = 0;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }

    @Test
    @Order(6)
    void testAllSamePrices() {
        final int[] prices = { 3, 3, 3, 3, 3 };
        final int expectedProfit = 0;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }

    @Test
    @Order(7)
    void testLargePriceJump() {
        final int[] prices = { 2, 4, 1, 10 };
        final int expectedProfit = 9;
        Assertions.assertEquals(expectedProfit, BestTimeToBuyAndSellStock.solution(prices));
    }
}
