public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotations = 4;

        ArrayUtil.shiftAndPrint(arr, 1, false);
        ArrayUtil.shiftAndPrint(arr, rotations, false);
    }


}