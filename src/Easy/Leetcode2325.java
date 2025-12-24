package Easy;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2325 {
    public static void main(String[] args) {
        Leetcode2325 obj = new Leetcode2325();
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(obj.decodeMessage(key, message));
    }
    public String decodeMessage(String key, String message) {
        Map<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (char c: key.toCharArray())
            if (c != ' ')
                if (!hm.containsKey(c))
                    hm.put(c, counter++);

        for (char c: message.toCharArray())
            if (c == ' ') sb.append(c);
            else sb.append((char)('a'+hm.get(c)));

        return sb.toString();
    }
}
