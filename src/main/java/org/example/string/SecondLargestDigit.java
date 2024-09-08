/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/">...</a>
 */
public class SecondLargestDigit {

    public static void demo() {

        System.out.println("\nDemo SecondLargestDigit problem :");

        final String str = "asb1asdhb4basmdb2";
        System.out.println(solution(str));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(String str) {

        //  Init both max values with -1
        int max = -1, max2 = -1;
        for (int i = 0; i < str.length(); ++i) {
            final char c = str.charAt(i);
            //  Check whether the char is a digit
            if (Character.isDigit(c)) {
                final int value = c - '0';
                if (value > max) {
                    max2 = max;
                    max = value;
                } else if (value > max2 && value < max) {
                    max2 = value;
                }
            }
        }

        return max2;
    }
}
