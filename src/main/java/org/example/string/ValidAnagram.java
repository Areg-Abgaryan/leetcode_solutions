/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/">...</a>
 */
public class ValidAnagram {

    public static void demo() {

        System.out.println("\nDemo ValidAnagram problem :");

        final String s = "anagram", t = "nagaram";
        System.out.println(solution(s, t));
        System.out.println(naiveSolution(s, t));
    }

    /**
     * O(n) complexity + O(1) space solution
     */
    static boolean solution(String s1, String s2) {
        //  Lengths cannot differ
        if (s1.length() != s2.length()) {
            return false;
        }

        final Map<Character, Integer> s1Char2ValueMap = new HashMap<>(100);

        final char[] s1CharArray = s1.toCharArray();
        final char[] s2CharArray = s2.toCharArray();
        for (char c : s1CharArray) {
            s1Char2ValueMap.put(c, s1Char2ValueMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s2CharArray) {
            //  Char doesn't exist in the map or its value is 0
            if (! s1Char2ValueMap.containsKey(c) || s1Char2ValueMap.get(c) == 0) {
                return false;
            } else {
                //  Decrease the count of the character in the map
                s1Char2ValueMap.put(c, s1Char2ValueMap.get(c) - 1);
            }
        }
        return true;
    }

    /**
     * O(n * log(n)) complexity + O(1) space solution
     */
    static boolean naiveSolution(String s1, String s2) {
        final char[] s1CharArray = s1.toCharArray();
        final char[] s2CharArray = s2.toCharArray();

        //  Sort the two char arrays
        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);

        //  Compare
        return Arrays.equals(s1CharArray, s2CharArray);
    }
}
