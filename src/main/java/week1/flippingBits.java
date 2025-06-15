package week1;

public class flippingBits {
    public static void main(String[] args) {
        System.out.println(1);
        flippingBitsAnswer(9);
        System.out.println(flippingBitsOptimised(2147483647)); // 2147483648
        System.out.println(flippingBitsOptimised(1));          // 4294967294
        System.out.println(flippingBitsOptimised(0));
    }

    public static long flippingBitsAnswer(long n) {
        // Write your code here
        long ans = 0;
        String number = Long.toBinaryString(n);
        String bit = "";
        String rev = "";
        for (int i = 0; i < 32 - number.length(); i++)
            bit += "0";
        bit += number;
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '1') {
                rev += '0';
            } else
                rev += '1';
        }
        System.out.println(bit + " " + bit.length());
        System.out.println(rev + " " + rev.length());
        System.out.println(Long.parseLong(rev, 2));
        return Long.parseLong(rev, 2);
    }

    public static long flippingBitsOptimised(long n) {
        return n ^ 0xFFFFFFFFL; // XOR with 32 bits of 1s
    }

}
