import java.util.*;

public class countAvg {

    public static int[] countArray(int[] arr, int x) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int avg = Math.floorDiv(arr[i] + x, 2);
            result[i] = freq.getOrDefault(avg, 0);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 6, 2};
        int x = 2;

        int[] result = countArray(arr, x);

        System.out.println(Arrays.toString(result));
    }
}