/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.array;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">...</a>
 */
public class BestTimeToBuyAndSellStock {

    public static void demo() {

        System.out.println("\nDemo BestTimeToBuyAndSellStock problem :");

        final int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(solution(prices));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(int[] prices) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, bestDiff = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = price;
                if (bestDiff < max - min) {
                    bestDiff = max - min;
                }
            }
        }

        return bestDiff;
    }
}
