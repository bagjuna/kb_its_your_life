package Zcodingtest;

class Solution22 {

    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(solution22.rob(nums)); // Output: 12
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i =2;i< nums.length;i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }

}