public class ArrayUtil {

    public static void shiftArrayRight(int[] arr, int rotations) {
        //temp arr
        int[] temp = new int[rotations];

        //initialize temp
        int tempCount = 0;
        for (int i = arr.length - rotations; i < arr.length; i++) {
            temp[tempCount] = arr[i];
            tempCount++;
        }

        //rotate from back of the array
        for (int i = arr.length - 1; rotations <= i; i = i - rotations) {
            //rotate numbers
            for (int j = i; i - rotations < j && 0 <= j - rotations; j--) {
                arr[j] = arr[j - rotations];
            }
        }

        //replce array with temp
        for (int i = 0; i < rotations; i++) {
            arr[i] = temp[i];
        }
    }


    public static void shiftAndPrint(int[] arr, int rotations, boolean right) {
        //print array
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
        if (right)
            shiftArrayRight(arr, rotations);
        else shiftArrayLeft(arr, rotations);
        //print final array
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }


    public static void shiftArrayLeft(int[] arr, int rotations) {
        //temp arr
        int[] temp = new int[rotations];

        //initialize temp
        int tempCount = 0;
        for (int i = 0; i < rotations; i++) {
            temp[tempCount] = arr[i];
            tempCount++;
        }

        //rotate from front of the array
        for (int i = 0; i < arr.length; i = i + rotations) {
            //rotate numbers
            for (int j = i; j < i + rotations && j + rotations < arr.length; j++) {
                arr[j] = arr[j + rotations];
            }
        }

        //replce array with temp
        tempCount = 0;
        for (int i = arr.length - rotations; i < arr.length; i++) {
            arr[i] = temp[tempCount++];
        }
    }


}
