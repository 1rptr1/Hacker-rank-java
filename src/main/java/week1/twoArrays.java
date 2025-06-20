package week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class twoArrays {
    public static void main(String[] args) {
        int k = 10;
        List<Integer> A = Arrays.asList(2, 1, 3);
        List<Integer> B = Arrays.asList(7, 8, 9);

        String result = twoArrays(k, A, B);
        System.out.println(result); // Expected: YES

        // Another example
        k = 5;
        A = Arrays.asList(1, 2, 2, 1);
        B = Arrays.asList(3, 3, 3, 4);

        result = twoArrays(k, A, B);
        System.out.println(result); // Expected: NO
    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        B.sort(Comparator.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if ((A.get(i) + B.get(i)) < k) {

                return "NO";
            }
        }
        return "YES";
    }
}


/*Your current approach is already optimal in asymptotic terms for this problem:

Sorting both arrays:
𝑂
(
𝑛
log
⁡
𝑛
)
O(nlogn)

Single pass check:
𝑂
(
𝑛
)
O(n)

The problem fundamentally requires sorting because you need to reorder elements to satisfy the pairwise sum condition. So you cannot avoid sorting here.

Why it cannot be faster than
𝑂
(
𝑛
log
⁡
𝑛
)
O(nlogn):
To guarantee that the permutation exists (or not), you must examine and rearrange elements.

Sorting is needed to pair smallest from one array with largest from the other.

No known comparison-based algorithm can beat
𝑂
(
𝑛
log
⁡
𝑛
)
O(nlogn) for this rearrangement.*/