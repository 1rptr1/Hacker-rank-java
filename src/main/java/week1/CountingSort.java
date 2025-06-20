package week1;

import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(
                63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67,
                99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3,
                89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87,
                42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46,
                44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33
        );
        System.out.println(countingSort(arr));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> mid = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            mid.put(arr.get(i), mid.getOrDefault(arr.get(i), 0) + 1);
        }
        for (int i = 0; i < 100; i++) {

            {
                ans.add(mid.getOrDefault(i, 0));
            }
        }
        return ans;
    }

    public static List<Integer> countingSort1(List<Integer> arr) {
        int[] frequency = new int[100]; // Array to count frequency of each number (0–99)

        for (int num : arr) {
            frequency[num]++;
        }

        // Convert array to List<Integer> for return
        List<Integer> result = new ArrayList<>();
        for (int count : frequency) {
            result.add(count);
        }

        return result;
    }


}
