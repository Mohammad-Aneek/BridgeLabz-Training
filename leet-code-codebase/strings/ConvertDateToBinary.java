// https://leetcode.com/problems/convert-date-to-binary/submissions/1867846312
// 3280. Convert Date to Binary

class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        String[] d = date.split("-");
        StringBuilder ans = new StringBuilder();
        for (String s : d) {
            if (ans.length() != 0)
                ans.append("-");

            int t = Integer.parseInt(s);
            StringBuilder str = new StringBuilder();
            while (t > 0) {
                int rem = t % 2;
                t /= 2;
                str.append((char) ('0' + rem));
            }
            ans.append(str.reverse());
        }
        return ans.toString();
    }
}
