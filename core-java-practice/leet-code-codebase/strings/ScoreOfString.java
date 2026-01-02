// https://leetcode.com/problems/score-of-a-string/submissions/1867827540
// 3110. Score of a String

class ScoreOfString {
    public int scoreOfString(String s) {
        int score = 0;
        char[] c = s.toCharArray();

        for(int i=0; i< c.length - 1; i++)
            score += Math.abs(c[i] - c[i+1]);

        return score;
    }
}
