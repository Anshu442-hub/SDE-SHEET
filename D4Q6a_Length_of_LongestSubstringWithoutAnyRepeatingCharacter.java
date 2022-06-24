package com.jKm;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class D4Q6a_Length_of_LongestSubstringWithoutAnyRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
//        if (l<2)return l;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Set< Character > se = new HashSet< >();
            for (int j = i; j < l; j++) {
                if (se.contains(s.charAt(j))) {
                    maxLen = Math.max(maxLen, j - i);
                    break;
                }
                maxLen = Math.max(maxLen, j - i+1);
                se.add(s.charAt(j));
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        D4Q6a_Length_of_LongestSubstringWithoutAnyRepeatingCharacter character=
                new D4Q6a_Length_of_LongestSubstringWithoutAnyRepeatingCharacter();

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
    }

}