package baidu25.exam.test2;

import java.util.Random;

public class RotationTester {

    // 优化解法
    public static String findLexicographicallySmallestRotation(String s) {
        int n = s.length();
        String doubledS = s + s;
        String minRotation = doubledS.substring(0, n);

        for (int i = 1; i < n; i++) {
            String rotation = doubledS.substring(i, i + n);
            if (rotation.compareTo(minRotation) < 0) {
                minRotation = rotation;
            }
        }
        return minRotation;
    }

    // 暴力解法
    public static String bruteForceSolution(String s) {
        int n = s.length();
        String minRotation = s;

        for (int i = 1; i < n; i++) {
            String rotation = s.substring(i) + s.substring(0, i);
            if (rotation.compareTo(minRotation) < 0) {
                minRotation = rotation;
            }
        }
        return minRotation;
    }

    // 随机字符串生成器
    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            // 生成一个随机小写字母
            char c = (char) (random.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }

    // 对数器方法
    public static void main(String[] args) {
        int testCount = 1000; // 测试次数
        int maxLength = 100;  // 最大字符串长度

        for (int i = 0; i < testCount; i++) {
            String testString = generateRandomString(new Random().nextInt(maxLength) + 1);

            // 调用优化解法和暴力解法
            String result1 = findLexicographicallySmallestRotation(testString);
            String result2 = bruteForceSolution(testString);

            // 对比结果
            if (!result1.equals(result2)) {
                System.out.println("测试失败！");
                System.out.println("输入字符串: " + testString);
                System.out.println("优化解法结果: " + result1);
                System.out.println("暴力解法结果: " + result2);
                return;
            }
        }

        System.out.println("所有测试通过！");
    }
}
