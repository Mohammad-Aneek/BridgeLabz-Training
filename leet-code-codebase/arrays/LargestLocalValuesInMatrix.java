// https://leetcode.com/problems/largest-local-values-in-a-matrix/submissions/1865670475
// problem number 2373: Largest local values in a matrix
class LargestLocalValuesInMatrix {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length;
        int [][]ans = new int[size-2][size-2];
        for (int i = 0; i < size - 2; i++){
            for (int j = 0; j < size - 2; j++) {
                int max = 0;
                for (int k = i; k < i + 3; k++){
                    for (int l = j; l < j + 3; l++){
                        max = Math.max(max, grid[k][l]);
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }
}
