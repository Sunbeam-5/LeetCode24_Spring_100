package baidu25.exam.test2;

import java.util.Scanner;

public class LexicographicallySmallestRotation {

    public static String findLexicographicallySmallestRotation(String s) {
        int n = s.length();
        // 将字符串扩展一倍，方便取出所有旋转的子串
        String doubledS = s + s;
        String minRotation = doubledS.substring(0, n); // 初始化结果为第一个旋转

        // 遍历所有可能的旋转位置
        for (int i = 1; i < n; i++) {
            // 获取从位置 i 开始的长度为 n 的子串
            String rotation = doubledS.substring(i, i + n);
            // 更新最小字典序字符串
            if (rotation.compareTo(minRotation) < 0) {
                minRotation = rotation;
            }
        }

        return minRotation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        
        // 输出最小字典序旋转结果
        System.out.println(findLexicographicallySmallestRotation(s));
    }
}
