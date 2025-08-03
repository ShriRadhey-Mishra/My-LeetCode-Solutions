package Leetcode.src.Easy;

import java.util.*;

public class Leetcode1154 {
    public int dayOfYear(String date) {
        HashMap<Integer, Integer> months = new HashMap<>();
        months.put(1,31);
        months.put(3,31);
        months.put(4,30);
        months.put(5,31);
        months.put(6,30);
        months.put(7,31);
        months.put(8,31);
        months.put(9,30);
        months.put(10,31);
        months.put(11,30);
        months.put(12,31);

        String[] separate = date.split("-");
        int day = Integer.parseInt(separate[2]);
        int month = Integer.parseInt(separate[1]);
        int year = Integer.parseInt(separate[0]);
        boolean leapYear = false;

        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                leapYear = false;
                if (year % 400 == 0) {
                    leapYear = true;
                }
            }
        }

        if (leapYear) months.put(2, 29);
        else months.put(2,28);

        int days = day;

        if (month == 1) return days;
        for (int i = 1; i < month; i++) {
            days += months.get(i);
        }

        return days;
    }

    public static void main(String[] args) {
        Leetcode1154 obj = new Leetcode1154();
        String date = "2019-01-09";
        System.out.println(obj.dayOfYear(date));
    }
}
