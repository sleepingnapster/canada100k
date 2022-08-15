import java.util.HashMap;

public class FunctionalProgrammingUtil {

    public static int flowerBoxProblem(int[] input) {
        int a = input[0];
        int b = input[1];
        int max;
        for (int i = 2; i < input.length; i++) {
            if ((a + input[i]) > b) {
                max = a + input[i];
            } else {
                max = b;
            }
            a = b;
            b = max;
        }
        return b;
    }

    static HashMap<String, Integer> memoizationCache = new HashMap<>();

    static int[] denomination = new int[]{1, 2, 3};

    public static int makeChange(int denominationIndex, int target) {
        if (memoizationCache.containsKey(denominationIndex + "," + target)) {
            return memoizationCache.get(denominationIndex + "," + target);
        }
        int choiceTake = 0;
        int choiceLeave;
        int optimal;
        int coinValue = denomination[denominationIndex];

        //choiceTake: the total least number of coins we need if we choose to take a coin
        if (target < coinValue) {
            //coin to large
            choiceTake = Integer.MAX_VALUE;
        } else if (coinValue == target) {
            //value reached
            choiceTake = 1;
        } else if (coinValue < target) {
            //take 1 coin and recurse
            choiceTake = 1 + makeChange(denominationIndex, target - coinValue);
        }

        //choiceLeave: the total least number of coins we need if we choose to leave the current a coin denomination
        if (denominationIndex == 0 || coinValue == target) {
            choiceLeave = Integer.MAX_VALUE;
        } else {
            choiceLeave = makeChange(denominationIndex - 1, target);
        }

        optimal = Math.min(choiceLeave, choiceTake);
        memoizationCache.put(denominationIndex + "," + target, optimal);
        return optimal;
    }
}
