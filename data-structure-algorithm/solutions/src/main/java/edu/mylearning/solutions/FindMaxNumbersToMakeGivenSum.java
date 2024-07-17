package edu.mylearning.solutions;

public class FindMaxNumbersToMakeGivenSum {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,5,3,9,10,2,3,6,9,15};
        int target = 60;
        int maxCount = findMaxCount(nums, target);
        System.out.println("The maximum count of numbers that can make " + target + " is: " + maxCount);
    }

    public static int findMaxCount(int[] nums, int target) {
        int[] dp = new int[target + 1];

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num] + 1 > dp[i]) {
                    dp[i] = dp[i - num] + 1;
                }
            }
        }

        return dp[target];
    }
}
