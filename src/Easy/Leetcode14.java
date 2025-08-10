package Easy;

public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0){
            return "";
        }
        String s = "";
        int smallestLength = Integer.MAX_VALUE;
        String check = "";
        for (String string: strs) if (string.length() < smallestLength) {
            smallestLength = string.length();
            check = string;
        }
        for (int i = 0; i < smallestLength; i++) {
            boolean commonInAll = true;
            for (String string: strs) {
                if (string.charAt(i) != check.charAt(i)) {
                    commonInAll = false;
                    break;
                }
            }
            if (!commonInAll) break;
            s = s.concat(String.valueOf(check.charAt(i)));
        }
        return s;
    }

    public static void main(String[] args) {
        Leetcode14 obj = new Leetcode14();
        String[] s = { "flower","flow","flight" };
        System.out.println(obj.longestCommonPrefix(s));
    }
}