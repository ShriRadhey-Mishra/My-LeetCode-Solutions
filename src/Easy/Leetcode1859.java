package Easy;

public class Leetcode1859 {
    public static void main(String[] args) {
        Leetcode1859 obj = new Leetcode1859();
        String s = "Myself2 Me1 I4 and3";
        System.out.println(obj.sortSentence(s));
    }
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] old = s.split(" ");
        String[] newS = new String[old.length];
        for (String word: old)
            newS[(word.charAt(word.length()-1)-'0')-1] = word.substring(0, word.length()-1);
        for (int i = 0; i < newS.length; i++) {
            sb.append(newS[i]);
            if (i != newS.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}
