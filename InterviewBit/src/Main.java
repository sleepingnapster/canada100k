public class Main {
    public static void main(String[] args) {

        int[] A = new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};

        System.out.println("s1");
        System.out.println(solve(A, 48));
        System.out.println("s");
    }

    public static int solve(int[] A, int B) {

        if (A.length == 0) return -1;

        return getMax(A, B, 0, A.length - 1);
    }

    public static int getMax(int[] A, int B, int frontIndex, int backIndex) {
        if (B != 0) {
            B--;
            return Math.max(getMax(A, B, frontIndex, backIndex - 1) + A[backIndex]
                    , getMax(A, B, frontIndex + 1, backIndex) + A[frontIndex]
            );
        }
        return 0;
    }
}