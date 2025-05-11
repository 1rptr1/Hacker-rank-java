package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class minMaxSolution {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = arr.get(0);
        int max = 0;
        long sum = 0;
        for (Integer i : arr) {
            sum += i;
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        System.out.println((sum - max) + " " + (sum - min));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
