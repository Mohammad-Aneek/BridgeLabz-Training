// https://leetcode.com/problems/build-array-from-permutation/submissions/1867803262
// leetcode problem number 1920. Build Array from Permutation
class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i<nums.length; i++)
            ans[i] = nums[nums[i]];

        return ans;
    }
}
