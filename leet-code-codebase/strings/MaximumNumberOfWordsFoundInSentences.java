// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/1867848594
// 2114. Maximum Number of Words Found in Sentences

class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int mostWords = 0;

        for(String s: sentences) {
            int n = s.split(" ").length;

            mostWords = Math.max(mostWords,n);
        }

        return mostWords;
    }
}
