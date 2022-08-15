import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] flowerBoxArray = new int[]{3, 10, 3, 1, 2};
        int[] flowerBoxArray2 = new int[]{9, 10, 9};
        System.out.println(FunctionalProgrammingUtil.flowerBoxProblem(flowerBoxArray));
        System.out.println(FunctionalProgrammingUtil.makeChange(2,5));
        System.out.println(FunctionalProgrammingUtil.makeChange(2,8));
        System.out.println(FunctionalProgrammingUtil.makeChange(2,2));
    }
}