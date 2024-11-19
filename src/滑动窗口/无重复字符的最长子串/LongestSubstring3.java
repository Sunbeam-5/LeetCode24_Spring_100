package 滑动窗口.无重复字符的最长子串;

import java.util.HashMap;

public class LongestSubstring3 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        // left 是窗口的左边界
        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // 如果当前字符已经在窗口中，更新左边界
            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }
            
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  // 输出: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));      // 输出: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));     // 输出: 3
    }
}
