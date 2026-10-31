public class targetElement {
    public static boolean findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 9, 19 };
        int target = 9;
        boolean ans = findTarget(arr, target);
        System.out.println(ans);
    }
}
