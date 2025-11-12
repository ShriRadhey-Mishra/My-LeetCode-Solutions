package Easy;

public class Leetcode1108 {
    public static void main(String[] args) {
        Leetcode1108 obj = new Leetcode1108();
        String s = "1.1.1.1";
        System.out.println(obj.defangIPaddr(s));
    }

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') sb.append("[.]");
            else sb.append(ch);
        }
        return sb.toString();
    }
}
