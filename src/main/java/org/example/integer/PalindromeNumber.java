/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.integer;

/**
 * <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 */
public class PalindromeNumber {

    public static void demo() {

        System.out.println("\nDemo PalindromeNumber problem :");

        final int x = 45678;
        System.out.println("Is number " + x + " palindrome ? " + solution(45678));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(int x) {
        int reversedNumber = 0;
        final int copyX = x;
        while (x > 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return reversedNumber == copyX;
    }
}
