/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/backspace-string-compare/">...</a>
 */
public class BackspaceStringsCompare {

    public static void demo() {

        System.out.println("\nDemo BackspaceStringsCompare problem :");

        final String s1 = "ab#c", s2 = "ad#c";
        System.out.println(solution(s1, s2));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(String s1, String s2) {

        //  Store two indices
        int s1i = s1.length() - 1, s2i = s2.length() - 1;

        while (s1i >= 0 || s2i >= 0) {
            s1i = findNextValidCharIndex(s1, s1i);
            s2i = findNextValidCharIndex(s2, s2i);

            //  Compare the characters whether both indices are valid
            if (s1i >= 0 && s2i >= 0 && s1.charAt(s1i) != s2.charAt(s2i)) {
                return false;
            }

            //  If one string is exhausted before the other
            if ((s1i >= 0) != (s2i >= 0)) {
                return false;
            }

            //  Move to the previous character
            --s1i;
            --s2i;
        }

        return true;
    }

    private static int findNextValidCharIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') {
                ++backspaceCount;
            } else if (backspaceCount > 0) {
                --backspaceCount;
            } else {
                break;
            }
            --index;
        }

        return index;
    }
}
