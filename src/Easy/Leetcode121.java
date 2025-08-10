package Easy;

public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int max = 0;
 
        for (int price : prices) {
            if (price < low) {
                low = price;
            } else if (price - low > max) {
                max = price - low;
            }
        }
 
        return max;
    }

    public static void main(String[] args) {
        Leetcode121 obj = new Leetcode121();
        int[] market = { 7,1,5,3,6,4 };
        System.out.println(obj.maxProfit(market));
    }
}