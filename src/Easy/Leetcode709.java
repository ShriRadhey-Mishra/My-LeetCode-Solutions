package Easy;

public class Leetcode709 {
    public static void main(String[] args) {
        Leetcode709 obj = new Leetcode709();
        String s = "JehfbweinIBIUHESICBIUehIHEihIKEJbIUUESBIUebIubIn";
        System.out.println(obj.toLowerCase(s));
    }
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
            if (ch[i] >= 65 && ch[i] <= 90)
                ch[i] += 32;
        return new String(ch);
    }
}
