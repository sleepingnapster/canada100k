package string_recursion_pattern;

public class LongestPalindrome {

    // #TopToBottom #NeedsMemoization 
    public static int getLongestPalindrome(String s) {
        return getLongestPalindromeRecursive(s, 0, s.length() - 1);
    }

    static int getLongestPalindromeRecursive(String s, int p1, int p2) {
        if (p1 == p2) return 1;
        if (p1 > p2) return 0;
        int takeEqualCharInConsideration = 0;
        int ignoreP1;
        int ignoreP2;
        if (s.charAt(p1) == s.charAt(p2)) {
            takeEqualCharInConsideration = 2 + getLongestPalindromeRecursive(s, p1 + 1, p2 - 1);
        }
        ignoreP1 = getLongestPalindromeRecursive(s, p1 + 1, p2);
        ignoreP2 = getLongestPalindromeRecursive(s, p1, p2 - 1);
        return Math.max(takeEqualCharInConsideration, Math.max(ignoreP1, ignoreP2));
    }
}
