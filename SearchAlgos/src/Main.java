import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(SearchUtils.binarySearchRecursive(arr, 3, 0, arr.length - 1));
        System.out.println(SearchUtils.binarySearchRecursive(arr, 9, 0, arr.length - 1));
        System.out.println(SearchUtils.binarySearchRecursive(arr, -3, 0, arr.length - 1));

        System.out.println(SearchUtils.binarySearch(arr, 3));
        System.out.println(SearchUtils.binarySearch(arr, 9));
        System.out.println(SearchUtils.binarySearch(arr, -3));

        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 9));
        System.out.println(Arrays.binarySearch(arr, -3));


    }
}