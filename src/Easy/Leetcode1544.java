package Easy;

public class Leetcode1544 {
    public static void main(String[] args) {
        Leetcode1544 obj = new Leetcode1544();
        String s = "leEeetcode";
        System.out.println(obj.makeGood(s));
    }
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int len = sb.length();
            if(len > 0 && Math.abs(sb.charAt(len-1) - ch) == 32) sb.deleteCharAt(len-1);
            else sb.append(ch);
        }
        return sb.toString();
    }
}
