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
}
