// https://leetcode.com/problems/maximum-substrings-with-distinct-start/submissions/1867831196
// 3760. Maximum Substrings With Distinct Start
class MaximumSubstringsWithDistinctStart {
    public int maxDistinct(String s) {
        boolean []freq = new boolean[26];
        int count = 0;
        
        for(int i = 0;i < s.length(); i++){
            int c = s.charAt(i) - 'a';
            if(freq[c])
                continue;
            else{
                freq[c] = true;
                count++;
            }
        }

        return count;
    }
}
