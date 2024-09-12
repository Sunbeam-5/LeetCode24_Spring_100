package 双指针.移动零;

class Solution {
    public void moveZeroes(int[] nums) {
        for (int cur = 0 , dest = -1; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                dest++;
                int tmp = 0;
                tmp = nums[cur];
                nums[cur] = nums[dest];
                nums[dest] = tmp;
            }
        }
    }
}
