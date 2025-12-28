package Easy;

public class Leetcode1678 {
    public static void main(String[] args) {
        Leetcode1678 obj = new Leetcode1678();
        String command = "G()(al)";
        System.out.println(obj.interpret(command));
    }

    public String interpret(String command) {
        char[] arr = command.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' && arr[i + 1] == ')') {
                sb.append('o');
                i++;
            } else if (arr[i] == '(' && arr[i + 1] == 'a') {
                sb.append("al");
                i += 3;
            } else sb.append(arr[i]);
        }
        return sb.toString();
    }
}
