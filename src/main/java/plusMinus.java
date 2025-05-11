import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class plusMinus {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinusSolution(arr);

        bufferedReader.close();
    }

    public static void plusMinusSolution(List<Integer> arr) {
        // Simple solution
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (Integer i : arr) {
            if (i > 0)
                positive++;
            if (i < 0)
                negative++;
            if (i == 0)
                zero++;

        }
        System.out.println(positive / arr.size());
        System.out.println(negative / arr.size());
        System.out.println(zero / arr.size());
    }

}
