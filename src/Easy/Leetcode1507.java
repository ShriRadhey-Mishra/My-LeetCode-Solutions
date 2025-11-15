package Easy;

import java.util.HashMap;

public class Leetcode1507 {
    public static void main(String[] args) {
        Leetcode1507 obj = new Leetcode1507();
        String date = "6th Dec 2004";
        System.out.println(obj.reformatDate(date));
    }
    public String reformatDate(String date) {
        int day, month, year;
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        String[] blocks = date.split(" ");

        hm.put("Jan", 1);
        hm.put("Feb", 2);
        hm.put("Mar", 3);
        hm.put("Apr", 4);
        hm.put("May", 5);
        hm.put("Jun", 6);
        hm.put("Jul", 7);
        hm.put("Aug", 8);
        hm.put("Sep", 9);
        hm.put("Oct", 10);
        hm.put("Nov", 11);
        hm.put("Dec", 12);

        year = Integer.parseInt(blocks[2]);
        month = hm.get(blocks[1]);
        day = Integer.parseInt(blocks[0].substring(0, blocks[0].length() - 2));

        sb.append(year);
        sb.append('-');
        if (month / 10 < 1) {
            sb.append(0);
            sb.append(month);
        } else
            sb.append(month);
        sb.append('-');
        if (day / 10 < 1) {
            sb.append(0);
            sb.append(day);
        } else
            sb.append(day);

        return sb.toString();
    }
}
