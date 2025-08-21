package Easy;

public class Leetcode1550 {
    public static void main(String[] args) {
        Leetcode1550 obj = new Leetcode1550();
        int[] arr1 = {2, 6, 4, 1};
        int[] arr2 = {1, 3, 5, 7};
        System.out.println(obj.threeConsecutiveOdds(arr1)); // false
        System.out.println(obj.threeConsecutiveOdds(arr2)); // true
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length -2; i++) {
            if (arr[i] %2 != 0) {
                if (arr[i+1] %2 != 0 && arr[i+2] %2 != 0)
                    return true;
            }
        }
        return false;
    }
}