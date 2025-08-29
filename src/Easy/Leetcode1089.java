package Easy;

import java.util.Arrays;

public class Leetcode1089 {
    public static void main(String[] args) {
        Leetcode1089 obj = new Leetcode1089();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(arr));
        obj.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == 0) {
//                for (int k = arr.length - 2; k > i; k--) {
//                    arr[k + 1] = arr[k];
//                }
//                arr[++i] = 0;
//            }

        int[] cpyArr = arr.clone();
        int length = arr.length;
        int index = 0;
        for (int i = 0; i < length && index < length; i++) {
            if (cpyArr[i] == 0) {
                arr[index++] = cpyArr[i];
                if (index < length) arr[index++] = 0;
            } else arr[index++] = cpyArr[i];
        }
    }
}
