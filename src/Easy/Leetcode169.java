package Easy;

public class Leetcode169 {
    public static void main(String[] args) {
        Leetcode169 obj = new Leetcode169();
        int[] arr = { 1, 2, 1, 2, 2, 2, 2, 1, 1, 2 };
        System.out.println("Majority Element: " + obj.majorityElement(arr));
    }
    public int majorityElement(int[] nums) {
        int element = -1;
        int count = 0;

        for (int num: nums) {
            if (count == 0) {
                element = num;
                count++;
            }
            else {
                if (num == element) count++;
                else count--;
            }
        }

        return element;
    }
}
