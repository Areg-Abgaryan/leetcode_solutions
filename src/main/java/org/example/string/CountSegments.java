/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/number-of-segments-in-a-string/solutions/">...</a>
 */
public class CountSegments {

    public static void demo() {

        System.out.println("\nDemo CountSegments problem :");

        final String str = "Google";
        System.out.println(solution(str));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static int solution(String str) {

        //  Simple cases
        if (str == null || str.isEmpty()) return 0;

        int count = 0;
        final String[] segments = str.split(" ");
        for (String segment : segments) {
            count += segment.isEmpty() ? 0 : 1;
        }

        return count;
    }
}
