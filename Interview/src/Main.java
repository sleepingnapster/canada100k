import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int[] input = new int[]{3, 30, 34, 9, 3};
        Integer result = getLargestNumberFromArray(input);
        System.out.println(result);
    }

    public static Integer getLargestNumberFromArray(int[] input) {
        PriorityQueue<String> t = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : input) {
            t.add(Integer.toString(a));
        }
        StringBuilder sb = new StringBuilder();
        for (String aa : t) {
            sb.append(aa);
        }
        return Integer.parseInt(sb.toString());
    }
}