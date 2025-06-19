package week1;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        );
        System.out.println(diagonalDifference1(arr));
    }

    public static int diagonalDifference1(List<List<Integer>> arr) {
        int right = 0;
        int left = 0;
        for (int i = 0; i < arr.size(); i++) {
            right += arr.get(i).get(i);
            left += arr.get(i).get(arr.size() - i - 1);
        }
        return Math.abs(right - left);
    }

}
