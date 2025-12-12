package Easy;

public class Leetcode3146 {
    public static void main(String[] args) {
        Leetcode3146 obj = new Leetcode3146();
        String s = "radhey";
        String t = "hearyd";
        System.out.println(obj.findPermutationDifference(s, t));
    }

    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        int[] diff = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            diff[i] = Math.abs(i - t.indexOf(s.charAt(i)));

        for (int num : diff) sum += num;

        return sum;
    }
}
