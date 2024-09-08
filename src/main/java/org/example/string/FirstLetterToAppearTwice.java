/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/first-letter-to-appear-twice/">...</a>
 */
public class FirstLetterToAppearTwice {

    public static void demo() {

        System.out.println("\nDemo FirstLetterToAppearTwice problem :");

        final String s = "abcczvvoa";
        System.out.print(solution(s));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static char solution(String str) {
        //  Store a boolean array for checking letters existence
        final boolean[] letters  = new boolean[26];

        final char[] lettersCharArray = str.toCharArray();
        for (char c : lettersCharArray) {
            if (letters[c - 'a']) {
                return c;
            } else {
                letters[c - 'a'] = true;
            }
        }

        return ' ';
    }
}
