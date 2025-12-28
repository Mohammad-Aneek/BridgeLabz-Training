// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/submissions/1867807333
// Leetcode problem number 3190. Find Minimum Operations to Make All Elements Divisible by Three

class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        for(int i: nums)
            if(i%3 != 0)
                operations++;
        
        return operations;
    }
}
