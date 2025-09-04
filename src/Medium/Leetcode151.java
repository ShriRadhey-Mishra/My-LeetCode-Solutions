package Medium;

public class Leetcode151 {
    public static void main(String[] args) {
        Leetcode151 obj = new Leetcode151();
        String s = "          SKAI is  your    GOD     ";
        System.out.println(obj.reverseWords(s));
    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int read = 0, write = 0;

        // skip leading spaces
        // read from left until char is fown and write char from beginning
        // add space only when new char is found
        for (char ch: arr) {
            if (Character.isSpaceChar(ch)) read++;
            else {
                arr[write++] = arr[read++];
                if (read < arr.length && Character.isSpaceChar(arr[read])) arr[write++] = ' ';
            }
        }

        // reverse the string till write
        int start = 0, end = write-1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }

        // reverse individual words
        start = 0;
        for (int i =0 ; i < write; i++) {
            if (Character.isSpaceChar(arr[i]) || i == write-1) {
                end = (i == write-1)? i: i-1;
                while (start < end) {
                    char temp = arr[start];
                    arr[start++] = arr[end];
                    arr[end--] = temp;
                }
                start = i+1;
            }
        }

        return new String(arr, 0, write).trim();
    }
}
