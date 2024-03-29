package javasolutionsforalgorithms.neetcode.string;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        return Arrays.equals(toArr(s), toArr(t));
    }

    public int[] toArr(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        return arr;
    }


    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] cOfs = s.toCharArray();
        Arrays.sort(cOfs);
        char[] cOft = t.toCharArray();
        Arrays.sort(cOft);

        if (Arrays.equals(cOfs, cOft)) {
            return true;
        }
        return false;
    }
}
