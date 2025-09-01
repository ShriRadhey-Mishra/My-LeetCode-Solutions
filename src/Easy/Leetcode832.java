package Easy;

import java.util.Arrays;

public class Leetcode832 {
    public static void main(String[] args) {
        Leetcode832 obj = new Leetcode832();
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(image));
        obj.flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(image));
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr: image) {
            reverse(arr);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] == 0)?1:0;
            }
        }
        return image;
    }

    public void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }
}