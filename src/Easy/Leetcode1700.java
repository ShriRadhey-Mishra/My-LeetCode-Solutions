package Easy;

import java.util.*;

public class Leetcode1700 {
    public static void main(String[] args) {
        Leetcode1700 obj = new Leetcode1700();
        int[] students = { 1,1,0,0 };
        int[] sandwiches = { 0,1,0,1 };
        System.out.println("Hungry Students: " + obj.countStudents(students, sandwiches));
    }
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwich = new Stack<>();
        Queue<Integer> student = new LinkedList<Integer>();
        int totalStudent = students.length;
        int totalSandwich = sandwiches.length;
        int studentsFed = 0;

        for (int stu: students) {
            student.add(stu);
        }

        for (int i = totalSandwich-1; i >=0; i--) {
            sandwich.push(sandwiches[i]);
        }

        int counter = 0;
        while (!student.isEmpty() && counter < student.size()){
            int sandwichAtTop = sandwich.peek();
            int studentToEat = student.remove();
            if (sandwichAtTop == studentToEat) {
                sandwich.pop();
                studentsFed++;
                counter = 0;
            } else {
                student.add(studentToEat);
                counter++;
            }
        }

        return totalStudent-studentsFed;
    }
}
