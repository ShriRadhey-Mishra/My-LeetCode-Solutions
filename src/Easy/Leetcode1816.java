package Easy;

public class Leetcode1816 {
    public static void main(String[] args) {
        Leetcode1816 obj = new Leetcode1816();
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(obj.truncateSentence(s, k));
    }

    public String truncateSentence(String s, int k) {
        int spaces = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') spaces++;
            if (spaces == k) return s.substring(0, i);
        }

        return s;
    }
}
