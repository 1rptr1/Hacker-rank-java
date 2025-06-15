package week1;

import java.util.*;



/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY strings
 *  2. STRING_ARRAY queries
 */


public class lonelyElements {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(1);
        data.add(2);
        data.add(2);
        data.add(3);
        data.add(3);
        data.add(5);
        System.out.println(lonelyInteger(data));

        System.out.println(lonelyChar("saurav"));
        List<Integer> nums = Arrays.asList(1, 2, 3, 2, 1);
        System.out.println(lonelyElement(nums)); // Output: 3

        List<String> words = Arrays.asList("apple", "banana", "apple");
        System.out.println(lonelyElement(words)); // Output: banana

    }

    public static int lonelyInteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> storer = new HashMap<Integer, Integer>();
        for (Integer k : a) {
            storer.put(k, storer.getOrDefault(k, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : storer.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return 0;
    }

    public static int lonelyIntegerOptimized(List<Integer> a) {
        int result = 0;
        for (int num : a) {
            result ^= num;  // XOR cancels out duplicates
        }
        return result;
    }

    public static char lonelyChar(String s) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        return result;
    }

    public static <T> T lonelyElement(List<T> list) {
        Map<T, Integer> freq = new HashMap<>();
        for (T item : list) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }
        for (Map.Entry<T, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }


}
