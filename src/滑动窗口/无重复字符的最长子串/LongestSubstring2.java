package 滑动窗口.无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring2 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0, right = 0;
        Set<Character> window = new HashSet<>();
        
        while (right < s.length()) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  // 输出: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));      // 输出: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));     // 输出: 3
    }
}
