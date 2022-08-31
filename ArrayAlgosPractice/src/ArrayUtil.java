import java.util.*;
import java.util.stream.Collectors;

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


    public int findLeastPeopleCostToFlyToCities(int[][] input) {

        Queue<Person> diff = new PriorityQueue<>(new PeopleComparator());
        for (int i = 0; i < input.length; i++) {
            diff.add(new Person(Math.abs(input[i][0] - input[i][1]) * -1, input[i][0], input[i][1]));
        }
        int result = 0;
        int city0 = 0;
        int city1 = 0;
        for (int i = 0; city0 <= diff.size() / 2 || city1 <= diff.size() / 2; i++) {
            Person p = diff.poll();
            if (p.city0 < p.city1) {
                city0++;
                result += p.city0;
            } else {
                city1++;
                result += p.city1;
            }
        }

        if (city0 <= input.length / 2) {
            Person p = diff.poll();
            result += p.city0;
        } else if (city0 <= input.length / 2) {
            Person p = diff.poll();
            result += p.city1;
        }

        return result;
    }

    public class PeopleComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.diff - o2.diff;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
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

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Set<Integer> s = new HashSet<>();
        PriorityQueue<Integer> result = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                result.add(arr[i]);
            } else {
                s.add(arr[i]);
            }
        }
        if (result.size() == 0) result.add(-1);
        return new ArrayList<>(new ArrayList<>(result));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int lastPointer = 0;
        int firstPointer = 0;
        int sum = arr[0];
        ArrayList<Integer> result = new ArrayList<>();
        if (s == 0) {
            result.add(-1);
            return result;

        }
        if (sum == s) {
            result.add(1);
            result.add(1);
            return result;
        }

        while (lastPointer < n - 1) {
            if (arr[lastPointer + 1] + sum <= s) {
                lastPointer++;
                sum += arr[lastPointer];
            } else {
                sum -= arr[firstPointer];
                firstPointer++;
            }
            if (sum == s) {
                result.add(firstPointer + 1);
                result.add(lastPointer + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}

