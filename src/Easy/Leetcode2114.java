package Easy;

public class Leetcode2114 {
    public static void main(String[] args) {
        Leetcode2114 obj = new Leetcode2114();
        String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(obj.mostWordsFound(sentence));
    }
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String s: sentences) {
            int words = s.split(" ").length;
            if (words >= count) count = words;
        }
        return count;
    }
}
