package Easy;

public class Leetcode28 {
    public int strStr(String haystack, String needle) {
        int lengthOfNeedle = needle.length();
        int sizeOfHaystack = haystack.length();
        int index = -1;
        for (int i = 0; i < (sizeOfHaystack-lengthOfNeedle+1); i++) {
            if (haystack.charAt(i)==needle.charAt(0) && haystack.regionMatches(true,i,needle,0,lengthOfNeedle)){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Leetcode28 obj = new Leetcode28();
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(obj.strStr(haystack, needle));
    }
}