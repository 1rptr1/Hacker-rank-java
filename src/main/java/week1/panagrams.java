package week1;

import java.util.HashSet;
import java.util.Set;

public class panagrams {
    public static void main(String[] args) {

        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    //  Time Complexity	Practical Speed	Simplicity
    //  O(26×n) ≈ O(n)	Good	Simple

    public static String pangrams(String s) {
        // Write your code here
        String ans = "panagram";
        s = s.toLowerCase();
        for (int i = 0; i < 26; i++) {
//&& s.lastIndexOf(String.valueOf((char) (i+97)))==s.indexOf(String.valueOf((char) (i+97)))
            if (!s.contains(String.valueOf((char) (i + 97)))) {
                System.out.println((char) (i + 97));
                return "not pangram";
            }
        }
        return ans;
    }
//Time Complexity	Practical Speed	Simplicity
//O(n)	Better (no rescans)	Clean + Fast

    public static String pangrams2(String s) {
        Set<Character> letters = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26 ? "pangram" : "not pangram";
    }
}
