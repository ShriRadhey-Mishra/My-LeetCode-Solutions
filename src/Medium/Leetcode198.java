package Medium;

public class Leetcode198 {
    public static void main(String[] args) {
        int[] houses = { 6, 7, 1, 30, 8, 2, 4};
        System.out.println(rob(houses));
    }
    private static int houseRobber(int[] houses, int currentHouse) {
        if (currentHouse>= houses.length) return 0;
        int stealFirst = houses[currentHouse] + houseRobber(houses, currentHouse+2);
        int skipFirst = houseRobber(houses, currentHouse+1);
        return Math.max(stealFirst, skipFirst);
    }

    public static int rob(int[] houses) {
        return houseRobber(houses, 0);
    }
}
