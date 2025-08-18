package Medium;

public class Leetcode43 {
    public static void main(String[] args) {
        Leetcode43 obj = new Leetcode43();
        String a = "123";
        String b = "456";
        System.out.println(obj.multiply(a, b));
    }

    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] answer = new int[len1 + len2];

        for (int i = len1 - 1; i > -1; i--) {
            for (int j = len2 - 1; j > -1; j--) {
                int p1 = i + j;
                int p2 = i + j + 1;
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + answer[p2];
                answer[p1] += sum / 10;
                answer[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : answer) {
            if (!(sb.isEmpty() && digit == 0)) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }
}
