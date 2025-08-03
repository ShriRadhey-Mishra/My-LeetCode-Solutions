package Leetcode.src.Easy;

public class Leetcode268 {
    public int missingNumber(int[] nums) {
        int[] visited = new int[nums.length+1];
        for (int num: nums) visited[num]++;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]==0)
                return i;
        }
        return nums[nums.length-1]+1;
    }

    public static void main(String[] args) {
        Leetcode268 obj = new Leetcode268();
        int[] num = { 3,0,1 };
        System.out.println(obj.missingNumber(num));
    }
}