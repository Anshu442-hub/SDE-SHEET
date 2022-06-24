package com.jKm;
import java.util.HashSet;
import java.util.Set;
public class D4Q6b_Length_of_LongestSubstringWithoutAnyRepeatingCharacter {


    public int lengthOfLongestSubstring(String s) {
        int maxAns = 0;
        Set < Character > set = new HashSet < > ();
        int l = 0;
//        System.out.println(s);
        for (int r = 0; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
//                System.out.println("if  "+r+" : "+set);
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
//                    System.out.println("while : "+set);
                }
            }
            set.add(s.charAt(r));
            maxAns = Math.max(maxAns, r - l + 1);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        D4Q6b_Length_of_LongestSubstringWithoutAnyRepeatingCharacter character=
                new D4Q6b_Length_of_LongestSubstringWithoutAnyRepeatingCharacter();

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
//O(2n)