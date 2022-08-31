package string_recursion_pattern;

public class LongestSubSequence {

    public int getLongestSubSeq(String s1, String s2, int p1, int p2) {
        if(p1==s1.length() || p2==s2.length()){
            return 0;
        }
        int currentMax = 0;
        if (s1.charAt(p1) == s2.charAt(p2)) {
            currentMax = 1 + getLongestSubSeq(s1, s2, p1+1, p2+1);
        }else{
            currentMax = Math.max(getLongestSubSeq(s1, s2, p1, p2+1),getLongestSubSeq(s1, s2, p1+1, p2));
        }
        return currentMax;
    }
}
