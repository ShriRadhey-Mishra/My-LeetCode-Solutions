package Easy;

public class Leetcode1528 {
    public static void main(String[] args) {
        Leetcode1528 obj = new Leetcode1528();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(obj.restoreString(s, indices));
    }
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}
