package Easy;

import java.util.Arrays;

public class Leetcode3668 {
    public static void main(String[] args) {
        Leetcode3668 obj = new Leetcode3668();
        int[] order = {3,1,2,5,4};
        int[] friends = {3,1,4};
        System.out.println(Arrays.toString(obj.recoverOrder(order, friends)));
    }
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        int index = 0;
        for (int k : order)
            for (int friend : friends)
                if (k == friend)
                    arr[index++] = k;
        return arr;
    }
}
