public class SearchUtils {

    public static boolean binarySearchRecursive(int[] sortedArr, int target, int start, int end) {

        int mid = (end + start) / 2;
        if (start == end) {
            if (sortedArr[start] == target) {
                return true;
            } else return false;
        }
        if (sortedArr[mid] == target) {
            return true;
        } else if (target < sortedArr[mid]) {
            return binarySearchRecursive(sortedArr, target, start, mid - 1);
        } else
            return binarySearchRecursive(sortedArr, target, mid + 1, end);
    }


    public static boolean binarySearch(int[] sortedArr, int target) {

        int min = 0;
        int max = sortedArr.length - 1;
        int mid = (min + max) / 2;

        while (min <= max) {
            mid = (min + max) / 2;

            if (sortedArr[mid] == target) return true;

            if (sortedArr[mid] < target) min = mid + 1;

            if (target < sortedArr[mid]) max = mid - 1;
        }
        return false;

    }


}
