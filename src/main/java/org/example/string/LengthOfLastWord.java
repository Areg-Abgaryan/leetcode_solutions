/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/length-of-last-word/">...</a>
 */
public class LengthOfLastWord {

    public static void demo() {

        System.out.println("\nDemo LengthOfLastWord problem :");

        final String str = "Hello World";
        System.out.println(solution(str));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(String str) {

        //  Simple case
        if (str == null || str.isEmpty()) return 0;

        boolean foundAWord = false;
        int lastWordLength = 0;

        for (int i = str.length() - 1; i >= 0; --i) {
            if (str.charAt(i) != ' ') {
                foundAWord = true;
                ++lastWordLength;
            } else if (foundAWord) {
                return lastWordLength;
            }
        }

        return lastWordLength;
    }
}
