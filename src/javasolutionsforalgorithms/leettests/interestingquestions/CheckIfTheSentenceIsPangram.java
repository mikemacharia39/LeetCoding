package javasolutionsforalgorithms.leettests.interestingquestions;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">link</a>
 *
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters,
 * return true if sentence is a pangram, or false otherwise.
 *
 *
 * Example 1:
 *
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 *
 *
 * Example 2:
 *
 * Input: sentence = "leetcode"
 * Output: false
 */
public class CheckIfTheSentenceIsPangram {


    /**
     * This is just beautiful
     * @param sentence sentence
     * @return true|false
     */
    public boolean checkIfPangram(String sentence) {
        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.
        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);

            // If 'sentence' doesn't contain currChar, it is not a pangram.
            if (sentence.indexOf(currChar) == -1)
                return false;
        }

        // If we manage to find all 26 letters, it is a pangram.
        return true;
    }

    /**
     * This checks for if all the english alphabets exists in the sentence provided
     * if the sentence does not have a letter, then return false
     *
     * @param sentence sentence
     * @return true|false
     */
    public boolean checkIfPangram_0(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphas.length(); i++) {
            if (sentence.indexOf(alphas.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Solution 2
     * @param sentence sentence
     * @return true|false
     */
    public boolean checkIfPangram1(String sentence) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }

    public boolean checkIfPangram2(String sentence) {
        int[] alphabetFeq = new int[26];

        for(int i = 0; i < sentence.length(); i++) {
            alphabetFeq[sentence.charAt(i) - 'a']++;
        }

        for (int freq : alphabetFeq) {
            if (freq == 0) {
                return false;
            }
        }

        return true;
    }
}
