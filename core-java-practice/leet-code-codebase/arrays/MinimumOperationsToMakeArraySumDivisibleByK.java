// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/submissions/1867797945
// Problem number 3512. Minimum Operations to Make Array Sum Divisible by K
class MinimumOperationsToMakeArraySumDivisibleByK {
    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for(int i: nums)
            sum += i;

        return sum % k;
    }
}
