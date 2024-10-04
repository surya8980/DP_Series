public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length < 2)
            return nums[0];
        int[] h1 = new int[nums.length + 1];
        int[] h2 = new int[nums.length + 1];
        h1[0]  = 0;
        h1[1]  = nums[0];
        h2[0] = 0;
        h2[1] = 0;
        for (int i = 2; i <= nums.length; i++) {
            h1[i] = Math.max(h1[i - 1], h1[i - 2] + nums[i-1]);
            h2[i] = Math.max(h2[i - 1], h2[i - 2] + nums[i-1]);
        }
        return Math.max(h1[nums.length - 1], h2[nums.length]);
    }
}