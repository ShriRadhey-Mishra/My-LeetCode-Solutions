package Easy;

public class Leetcode2169 {
    public static void main(String[] args) {
        Leetcode2169 obj = new Leetcode2169();
        int num1 = 2;
        int num2 = 3;
        System.out.println(obj.countOperations(num1, num2));
    }
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1*num2 != 0) {
            if (num1 == num2) return count+1;
            if (num1 > num2) {
                int temp = num1/num2;
                num1-= num2*temp;
                count+=temp;
            } else {
                int temp = num2/num1;
                num2-= num1*temp;
                count+=temp;
            }
        }
        return count;
    }
}
