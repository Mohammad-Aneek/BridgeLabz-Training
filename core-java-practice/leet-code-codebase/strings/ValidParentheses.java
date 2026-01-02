// https://leetcode.com/problems/valid-parentheses/submissions/1868119400
// 20. Valid Parentheses

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        loop: for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '(':
                case '{':
                case '[':
                    st.push(c);
                    continue loop;
            }
            if (st.empty())
                return false;

            char top = st.peek();
            if (top == '(' && ')' == c || top == '{' && '}' == c || top == '[' && ']' == c)
                st.pop();cd 
            else
                return false;
        }
        if (st.empty())
            return true;
        else
            return false;
    }
}
