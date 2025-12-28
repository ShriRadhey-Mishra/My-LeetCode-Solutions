package Easy;

public class Leetcode2185 {
    public static void main(String[] args) {
        Leetcode2185 obj = new Leetcode2185();
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(obj.prefixCount(words, pref));
    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String word : words)
            if (word.startsWith(pref))
                count++;
        return count;
    }
}
