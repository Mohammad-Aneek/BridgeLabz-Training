// https://leetcode.com/problems/jewels-and-stones/submissions/1867836194
// 771. Jewels and Stones 

class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jew = new boolean[256];
        int n = jewels.length();
        for (int i = 0; i < n; i++)
            jew[jewels.charAt(i)] = true;

        n = stones.length();
        int ans = 0;

        for (int j = 0; j < n; j++)
            if (jew[stones.charAt(j)])
                ans++;

        return ans;
    }
}
