package Easy;

public class Leetcode1614 {
    public static void main(String[] args) {
        Leetcode1614 obj = new Leetcode1614();
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(obj.maxDepth(s));
    }
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(') count++;
            if (ch == ')') count--;
            if (count > max) max = count;
        }
        return max;
    }
}
