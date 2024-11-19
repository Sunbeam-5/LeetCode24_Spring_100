package 滑动窗口.无重复字符的最长子串;

public class LongestSubstring1 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        // 两层循环枚举所有子串
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }
        return maxLength;
    }
    
    // 判断子串s[i:j]是否有重复字符
    private static boolean isUnique(String s, int start, int end) {
        boolean[] chars = new boolean[128];  // 假设字符是ASCII编码
        
        for (int i = start; i < end; i++) {
            if (chars[s.charAt(i)]) {
                return false;
            }
            chars[s.charAt(i)] = true;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  // 输出: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));      // 输出: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));     // 输出: 3
    }
}
