// 有效的括号https://leetcode.cn/problems/valid-parentheses/

package stack;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // 如果栈为空，则括号全部匹配，返回true；否则返回false
    }

    public static void main(String[] args) {
        // 测试用例
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println("Test case 1: " + isValid(test1)); // true
        System.out.println("Test case 2: " + isValid(test2)); // true
        System.out.println("Test case 3: " + isValid(test3)); // false
        System.out.println("Test case 4: " + isValid(test4)); // false
        System.out.println("Test case 5: " + isValid(test5)); // true
    }
}
