package 滑动窗口.长度最小的子数组;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; // 左边界
        int sum = 0;  // 当前窗口的和
        int minLen = Integer.MAX_VALUE; // 用于存储最小长度
        
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // 将右边界的值加入到 sum 中
            
            // 当当前窗口的和 >= target 时，尝试缩小窗口
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1); // 更新最小长度
                sum -= nums[left]; // 减去左边界的值，缩小窗口
                left++; // 左边界右移
            }
        }
        
        // 如果没有找到符合条件的子数组，返回 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
