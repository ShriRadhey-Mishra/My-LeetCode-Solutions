package Easy;

public class Leetcode1323 {
    public static void main(String[] args) {
        Leetcode1323 obj = new Leetcode1323();
        int number = 6969;
        System.out.println(obj.maximum69Number(number));
    }

    public int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char number : digits) {
            sb.append(number);
        }

        return Integer.parseInt(sb.toString());
    }
}
