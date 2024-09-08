/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/isomorphic-strings/">...</a>
 */
public class IsomorphicStrings {

    public static void demo() {

        System.out.println("\nDemo IsomorphicStrings problem :");

        final String s1 = "egg", s2 = "add";
        System.out.println(solution(s1, s2));
    }

    /**
     * O(n) complexity + O(n) space
     */
    static boolean solution(String s1, String s2) {

        //  Simple cases
        if (s1 == null || s1.isEmpty() || s2 == null || s2.isEmpty() || s1.length() != s2.length()) {
            return false;
        }

        final Map<Character, Character> char2charMap = new HashMap<>();
        final Set<Character> mappedChars = new HashSet<>();

        //  Compare all the elements
        for (int i = 0; i < s1.length(); ++i) {
            final char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if (char2charMap.containsKey(c1)) {
                //  If the mapping exists but doesn't match, return false
                if (char2charMap.get(c1) != c2) {
                    return false;
                }
            } else {
                //  If c2 has already been mapped, it's an invalid mapping
                if (mappedChars.contains(c2)) {
                    return false;
                }
                char2charMap.put(c1, c2);
                mappedChars.add(c2);
            }
        }

        return true;
    }
}
