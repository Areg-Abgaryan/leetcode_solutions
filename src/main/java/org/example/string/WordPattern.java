/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/word-pattern/">...</a>
 */
public class WordPattern {

    public static void demo() {

        System.out.println("\nDemo WordPattern problem :");

        final String pattern = "abba", str = "dog cat cat dog";
        System.out.println(solution(pattern, str));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static boolean solution(String pattern, String str) {

        //  Simple cases
        if (pattern.isBlank()) return str.isBlank();
        if (str.isBlank()) return pattern.isBlank();

        //  Store maps for saving key to value pairs
        final Map<Character, String> char2Value = new HashMap<>();
        final Map<String, Character> value2Char = new HashMap<>();

        //  Find the words in the string
        final String[] words = str.split(" ");

        //  Compare the lengths
        if (words.length != pattern.length()) return false;

        for (int strIndex = 0, patternIndex = 0; strIndex < words.length; ++strIndex, ++patternIndex) {
            final String tmpString = char2Value.get(pattern.charAt(patternIndex));
            final Character tmpChar = value2Char.get(words[strIndex]);

            //  No match was found, add in the maps
            if (tmpString == null && tmpChar == null) {
                char2Value.put(pattern.charAt(patternIndex), words[strIndex]);
                value2Char.put(words[strIndex], pattern.charAt(patternIndex));
            } else {
                //  Add here vice versa handling for the char and string elements
                if (tmpChar == null) {
                    if (! tmpString.equals(words[strIndex])) return false;
                } else if (tmpString == null) {
                    if (tmpChar != pattern.charAt(patternIndex)) return false;
                } else {
                    if (tmpChar != pattern.charAt(patternIndex) || ! tmpString.equals(words[strIndex])) return false;
                }
            }
        }

        return true;
    }
}
