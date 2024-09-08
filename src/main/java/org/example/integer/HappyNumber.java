/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

/**
 * <a href="https://leetcode.com/problems/happy-number/">...</a>
 */
public class HappyNumber {

    public static void demo() {

        System.out.println("\nDemo HappyNumber problem :");

        final int num = 192;
        System.out.println(solution(num));
    }

    /**
     * O(log(n)) complexity + O(1) space solution
     */
    static boolean solution(int num) {
        while (num > 9) {
            num = sumOfSquares(num);
        }

        return num == 1 || num == 7;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            sum += Math.pow(num % 10, 2);
            num /= 10;
        }
        return sum;
    }
}
