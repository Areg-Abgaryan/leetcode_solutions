/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/is-subsequence/">...</a>
 */
public class IsSubsequence {

    public static void demo() {

        System.out.println("\nDemo IsSubsequence problem :");

        final String candidate = "abc", str = "ahbgdc";
        System.out.println(solution(candidate, str));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(String candidate, String str) {

        //  Simple cases
        if (! candidate.isEmpty() && str.isEmpty()) return false;
        if (candidate.isEmpty()) return true;

        //  Iterate over the string and check the candidate element by element
        int candidateIndex = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (candidateIndex == candidate.length()) return true;
            if (str.charAt(i) == candidate.charAt(candidateIndex)) {
                ++candidateIndex;
            }
        }

        return candidateIndex == candidate.length();
    }
}
