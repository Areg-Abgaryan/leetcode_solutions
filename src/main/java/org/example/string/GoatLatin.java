/**
 * Copyright (c) 2024 Areg Abgaryan
 */

package org.example.string;

/**
 * <a href="https://leetcode.com/problems/goat-latin/">...</a>
 */
public class GoatLatin {

    public static void demo() {

        System.out.println("\nDemo GoatLatin problem :");

        final String sentence = "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.println(solution(sentence));
    }

    /**
     * O(n) complexity + O(n) space solution
     */
    static String solution(String sentence) {

        //  Simple cases
        if (sentence == null || sentence.isEmpty()) return "";

        //  Get the words array from the sentence
        final String[] words = sentence.split(" ");
        final String pattern = "ma";
        final char symbol = 'a', space = ' ';
        int wordCount = 1;

        final var sb = new StringBuilder();

        for (String word : words) {
            final char letter = word.charAt(0);
            //  The word begins with a vowel
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
                    letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                sb.append(word);
            } else {
                //  The word begins with a consonant
                for (int c = 1; c < word.length(); ++c) {
                    sb.append(word.charAt(c));
                }

                //  Append first character in the end as well
                sb.append(word.charAt(0));
            }

            //  Append the pattern "ma*" in the end of the word
            sb.append(pattern);
            sb.append(String.valueOf(symbol).repeat(Math.max(0, wordCount)));

            //  Append space and increase the word count in the end
            sb.append(space);
            ++wordCount;
        }

        //  Avoid the last space
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
