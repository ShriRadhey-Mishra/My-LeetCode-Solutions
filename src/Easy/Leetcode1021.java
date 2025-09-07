package Easy;

public class Leetcode1021 {
    public static void main(String[] args) {
        Leetcode1021 obj = new Leetcode1021();
        String s = "(()()())()()((()())())";
        System.out.println(s);
        System.out.println(obj.removeOuterParentheses(s));
    }

    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for (char ch: s.toCharArray()){
            if (ch == '(') {
                if (open > 0) sb.append(ch);
                open++;
            } else {
                open--;
                if (open > 0) sb.append(ch);
            }
        }

        return sb.toString();
    }
}
