public class MinMaxArray {

    public static int[] getMinMax(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 3, 5, 8, 6};

        int result[] = getMinMax(arr);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}