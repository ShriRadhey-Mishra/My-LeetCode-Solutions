package Easy;

public class Leetcode415 {
    public static void main(String[] args) {
        Leetcode415 obj = new Leetcode415();
        String a = "432789";
        String b = "5305180";
        System.out.println(obj.addStrings(a, b));
    }
    public String addStrings(String num1, String num2) {
        int firstNum = num1.length() -1;
        int secondNum = num2.length() -1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (firstNum>= 0 || secondNum >= 0 || carry!=0) {
            int digit1 = (firstNum>= 0) ? num1.charAt(firstNum) - '0' : 0;
            int digit2 = (secondNum>= 0) ? num2.charAt(secondNum) - '0' : 0;
            int total = digit1 + digit2 + carry;
            sb.append(total%10);
            carry = total/10;
            firstNum--;
            secondNum--;
        }
        return sb.reverse().toString();
    }
}
