package com.jKm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class D4Q6c_Length_of_LongestSubstringWithoutAnyRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        HashMap< Character, Integer > hmap = new HashMap<>();

        int l = 0, r = 0;
        int n = s.length();
        int max = 0;
        while (r < n) {
            if (hmap.containsKey(s.charAt(r)))
                l = Math.max(hmap.get(s.charAt(r)) + 1, l);
            hmap.put(s.charAt(r), r);
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        D4Q6c_Length_of_LongestSubstringWithoutAnyRepeatingCharacter character=
                new D4Q6c_Length_of_LongestSubstringWithoutAnyRepeatingCharacter();

        System.out.println(character.lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(character.lengthOfLongestSubstring("abcaabcdba"));//4
        System.out.println(character.lengthOfLongestSubstring(""));//0
        System.out.println(character.lengthOfLongestSubstring(" "));//1
        System.out.println(character.lengthOfLongestSubstring("a"));//1
        System.out.println(character.lengthOfLongestSubstring("au"));//2
        System.out.println(character.lengthOfLongestSubstring("aa"));//1
        System.out.println(character.lengthOfLongestSubstring("ax"));//2
        System.out.println(character.lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(character.lengthOfLongestSubstring("bbbb"));//1
        System.out.println(character.lengthOfLongestSubstring("pwwkew"));//3
    }}
