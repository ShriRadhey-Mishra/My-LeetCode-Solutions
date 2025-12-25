package Easy;

import java.util.List;

public class Leetcode1773 {
    public static void main(String[] args) {
        Leetcode1773 obj = new Leetcode1773();
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(obj.countMatches(items, ruleKey, ruleValue));
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index;

        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else index = 2;

        int rows = items.size();

        for (int i = 0; i < rows; i++)
            if (items.get(i).get(index).equals(ruleValue))
                count++;

        return count;
    }
}
