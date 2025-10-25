package Easy;

public class Leetcode1716 {
    public static void main(String[] args) {
        Leetcode1716 obj = new Leetcode1716();
        int n = 10;
        System.out.println(obj.totalMoney(n));
    }
    public int totalMoney(int n) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        int count = 0;
        for (int i = 0; i < n; i++) {
            int index = i % 7;
            count += arr[index];
            arr[index] += 1;
        }
        return count;
    }
}
