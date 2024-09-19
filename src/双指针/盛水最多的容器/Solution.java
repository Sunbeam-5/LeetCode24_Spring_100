package 双指针.盛水最多的容器;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int v = (height[left] > height[right] ? height[right] : height[left]) * (right - left);
            System.out.println("v: " + v);
            if (v > max) {
                max = v;
            }
            if (height[left] >= height[right]) {
                right--;
                // System.out.println("left: " + left);
                // System.out.println("right: " + right);
            }

            else {
                left++;
                // System.out.println("left: " + left);
                // System.out.println("right: " + right);
            }

        }
        return max;
    }

}