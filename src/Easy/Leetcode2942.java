package Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2942 {
    public static void main(String[] args) {
        Leetcode2942 obj = new Leetcode2942();
        String[] words = {"leet", "code"};
        char x = 'e';
        System.out.println(obj.findWordsContaining(words, x));
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                list.add(i);
        }
        return list;
    }
}
