/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/find-the-difference/">...</a>
 */
public class FindTheDifference {

    public static void demo() {

        System.out.println("\nDemo FindTheDifference problem :");

        final String shortStr = "abc", longStr = "ahbgdc";
        System.out.println(solution(shortStr, longStr));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static char solution(String shortStr, String longStr) {

        //  Find the difference via calculating the sums of two strings
        int longStrSum = 0;

        //  Calculate the sum of the longer string
        for (int x : longStr.toCharArray()) {
            longStrSum += x;
        }

        //  Subtract all elements of short string from the longer one
        for (int x : shortStr.toCharArray()) {
            longStrSum -= x;
        }

        return (char) (longStrSum);
    }
}
