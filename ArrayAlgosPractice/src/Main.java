public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotations = 4;

//        ArrayUtil.shiftAndPrint(arr, 1, false);
//        ArrayUtil.shiftAndPrint(arr, rotations, false);


        int[][] cities = {{10,20},{30,200},{400,50},{30,20}};
        ArrayUtil a = new ArrayUtil();
        a.findLeastPeopleCostToFlyToCities(cities);
    }


}