// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/submissions/1867816817
// Leetcode problem number 1769. Minimum Number of Operations to Move All Balls to Each Box

class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] operations = new int[n];
        char[] c = boxes.toCharArray();

        for(int i = 0; i<n; i++){
            if(c[i] == '0')
                continue;

            for(int j = 0; j < n; j++)
                operations[j] += Math.abs(j-i);
        }

        return operations;
    }
}
