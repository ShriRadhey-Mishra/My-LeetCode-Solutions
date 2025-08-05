package Easy;

public class Leetcode3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[n];
        int unplacedCount = 0;

        for (int fruit : fruits) {
            boolean placed = false;
            for (int i = 0; i < n; i++) {
                if (!used[i] && baskets[i] >= fruit) {
                    used[i] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplacedCount++;
            }
        }

        return unplacedCount;
    }

    public static void main(String[] args) {
        Leetcode3477 obj = new Leetcode3477();
        int[] fruits = { 4, 3, 5 };
        int[] basket = { 3, 5, 4 };
        System.out.println(obj.numOfUnplacedFruits(fruits, basket));
    }
}
