package Easy;

public class Leetcode374 {
    public int pick = 10;

    public static void main(String[] args) {
        Leetcode374 obj = new Leetcode374();
        System.out.println(obj.guessNumber(1000));
    }

    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        int start = 0;
        int end = n;
        int mid = start + (end - start) / 2;
        int whereToMove = guess(mid);
        do {
            if (whereToMove == -1) {
                end = mid;
                mid = start + (end - start) / 2;
                whereToMove = guess(mid);
            } else if (whereToMove == 1) {
                start = mid;
                mid = start + (end - start) / 2;
                whereToMove = guess(mid);
            } else break;
        } while (whereToMove != 0);
        return mid;
    }

    public int guess(int num) {
        if (num == pick) return 0;
        return (num > pick) ? -1: 1;
    }
}
