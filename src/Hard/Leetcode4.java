package Hard;

public class Leetcode4 {
    public static void main(String[] args) {
        Leetcode4 obj = new Leetcode4();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(obj.findMedianSortedArrays(arr1, arr2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] combineSorted = new int[size1 + size2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < size1 && j < size2) {
            int num1 = nums1[i];
            int num2 = nums2[j];
            combineSorted[k] = Math.min(num1, num2);
            if (combineSorted[k] == num1)
                i++;
            else
                j++;
            k++;
        }
        while (i < size1) {
            combineSorted[k++] = nums1[i++];
        }
        while (j < size2) {
            combineSorted[k++] = nums2[j++];
        }
        int length = combineSorted.length;
        if (length % 2 != 0)
            return combineSorted[length / 2];
        else
            return (combineSorted[length / 2 - 1] + combineSorted[length / 2]) / 2.0;
    }
}