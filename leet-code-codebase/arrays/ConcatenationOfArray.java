// https://leetcode.com/problems/concatenation-of-array/submissions/1865657970
// leetcode problem nmber 1929: Concatenation Of Array
class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[2 * nums.length];
        for(int i = 0; i < 2 * nums.length; i++){
            arr[i] = nums[i % nums.length];
        }
        return arr;
    }
}
