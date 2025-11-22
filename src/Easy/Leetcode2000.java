package Easy;

public class Leetcode2000 {
    public static void main(String[] args) {
        Leetcode2000 obj = new Leetcode2000();
        String word = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(obj.reversePrefix(word, 'i'));
    }
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int l = 0, r = 0;
        for (char c: arr) {
            if (c == ch) break;
            r++;
        }
        if (r == word.length()) return word;
        while (l<r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }

        return new String(arr);
    }
}
