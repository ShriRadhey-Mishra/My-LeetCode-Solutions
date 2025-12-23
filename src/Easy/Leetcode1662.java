package Easy;

public class Leetcode1662 {
    public static void main(String[] args) {
        Leetcode1662 obj = new Leetcode1662();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(obj.arrayStringsAreEqual(word1, word2));
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return (String.join("", word1).equals(String.join("", word2)));
    }
}
