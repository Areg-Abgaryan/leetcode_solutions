/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">...</a>
 */
public class IndexOfTheFirstOccurrence {

    public static void demo() {

        System.out.println("\nDemo IndexOfTheFirstOccurrence problem :");

        final String s = "asadcczvvobsada", needle = "sad";
        System.out.print(solution(s, needle));
    }

    /**
     * O(n) complexity + O(1) space solution
     */


    static int solution(String haystack, String needle) {

        final int noMatchValue = -1;

        //  Simple case
        if (needle.length() > haystack.length()) return noMatchValue;

        final int haystackLength = haystack.length(), needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; ++i) {
            int j;
            for (j = 0; j < needleLength; ++j) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            //  Match found
            if (j == needleLength) {
                return i;
            }
        }

        return noMatchValue;
    }
}
