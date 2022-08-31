public class MaxProductSubArray {
    public static int getMaxProductSubArray(int[] arr) {

        //max

        //min
        int result = arr[0];
        int max = 1;
        int min = 1;
        int a;
        int b;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                a = 1;
                b = 1;
            } else {
                a = max * arr[i];
                b = min * arr[i];
            }
            max = Math.max(Math.max(a, b), arr[i]);
            min = Math.min(Math.min(a, b), arr[i]);
            result = Math.max(result,max);
        }

        System.out.println("max" + result);
        System.out.println("min" + min);
        return result;
    }
}
