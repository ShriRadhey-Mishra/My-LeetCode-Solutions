package Easy;

public class Leetcode3280 {
    public static void main(String[] args) {
        Leetcode3280 obj = new Leetcode3280();
        String s = "2004-12-06";
        System.out.println(obj.convertDateToBinary(s));
    }
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String[] arr = date.split("-");
        for(int i = 0; i < 3; i++)
            arr[i] = Integer.toBinaryString(Integer.parseInt(arr[i]));
        for (int i = 0; i < 3; i++) {
            sb.append(arr[i]);
            if (i != 2) sb.append("-");
        }
        return sb.toString();
    }
}
