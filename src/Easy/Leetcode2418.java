package Easy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode2418 {
    public static void main(String[] args) {
        Leetcode2418 obj = new Leetcode2418();
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(obj.sortPeople(names, heights)));
    }
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]
        );

        for (int i = 0; i < names.length; i++) {
            pq.offer(new int[]{heights[i], i});
        }

        String[] result = new String[names.length];
        int idx = 0;

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            result[idx++] = names[top[1]];
        }

        return result;
    }
}
