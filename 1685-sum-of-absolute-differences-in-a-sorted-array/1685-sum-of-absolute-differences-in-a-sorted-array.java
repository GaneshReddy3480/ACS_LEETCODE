class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int total = 0;
        int leftSum = 0;
        int i, ls, rs;

        int[] ans = new int[n];
        for (int num : nums) {
            total += num;
        }
        for (i = 0; i < n; i++) {
            ls = i * nums[i] - leftSum;
            rs = (total - leftSum - nums[i]) - (n - i - 1) * nums[i];

            ans[i] = ls + rs;
            leftSum += nums[i];
        }

        return ans;
    }
}