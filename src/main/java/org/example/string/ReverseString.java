/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/reverse-string/">...</a>
 */
public class ReverseString {

    public static void demo() {

        System.out.println("\nDemo ReverseString problem :");

        final char[] charArray = "somestringtobereversed".toCharArray();
        solution(charArray);
        System.out.println(charArray);
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static void solution(char[] s) {

        //  Run over the array and substitute the opposite elements
        for (int i = 0; i < s.length / 2; ++i) {
            final char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static void recursiveSolution(char[] s) {
        recursiveHelper(s.length - 1, s);
    }

    static void recursiveHelper(int index, char[] s) {

        //  When we get to the middle - return
        if (index < s.length / 2) {
            return;
        }

        //  Swap elements
        final char temp = s[index];
        s[index] = s[s.length - index - 1];
        s[s.length - index - 1] = temp;

        recursiveHelper(index - 1, s);
    }
}
