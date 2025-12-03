package Easy;

public class Leetcode2535 {
    public static void main(String[] args) {
        Leetcode2535 obj = new Leetcode2535();
        int[] arr = {1, 15, 6, 3};
        System.out.println(obj.differenceOfSum(arr));
    }

    public int differenceOfSum(int[] nums) {
        int element = 0, digit = 0;
        for (int num : nums) {
            element += num;
            while (!(num < 1)) {
                digit += num % 10;
                num /= 10;
            }
        }
        return Math.abs(element - digit);
    }
}
