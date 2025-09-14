package Medium;

import java.util.*;

public class Leetcode950 {
    public static void main(String[] args) {
        Leetcode950 obj = new Leetcode950();
        int[] deck = { 17,13,11,2,3,5,7 };
        System.out.println(Arrays.toString(obj.deckRevealedIncreasing(deck)));
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int size = deck.length;
        int[] output = new int[size];
        int pos = 0;
        int[] index = new int[size];
        Queue<Integer> queue = new LinkedList<>();
        Arrays.sort(deck); // O(n log n)
        for (int i = 0; i < size; i++) queue.add(i); // O(n)
        while(!queue.isEmpty()) {  // O(n)
            index[pos++] = queue.remove();
            if (!queue.isEmpty()){
                int last = queue.remove();
                queue.add(last);
            }
        }
        pos = 0;
        for (int i : index) { // O(n)
            output[i] = deck[pos++];
        }
        return output;
    }
}
