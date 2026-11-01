public class MaximumArray {

    public static int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 6, 4, 9};

        System.out.println("Maximum value in the array is: " + findMax(arr));
    }
}