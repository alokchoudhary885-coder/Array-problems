public class MultiplyBy5 {

    public static int[] multiplyBy5(int[] arr) {

        int size = arr.length;
        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {

            int element = arr[i];
            int newElement = element * 5;

            newArr[i] = newElement;
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] ans = multiplyBy5(arr);

        System.out.println("Printing answer array:");

        for (int i : ans) {
            System.out.println(i);
        }
    }
}