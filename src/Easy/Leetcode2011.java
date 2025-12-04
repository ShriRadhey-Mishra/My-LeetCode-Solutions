package Easy;

public class Leetcode2011 {
    public static void main(String[] args) {
        Leetcode2011 obj = new Leetcode2011();
        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(obj.finalValueAfterOperations(operations));
    }
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String op: operations) {
            if (op.charAt(1) == '+') count++;
            else count--;
        }
        return count;
    }
}
