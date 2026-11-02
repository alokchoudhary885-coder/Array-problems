
public class COUNTzeroANDones {

    public static int[] countZeroANDOne(int[] arr) {

        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                countZero++;
            } else {
                countOne++;
            }
        }

        int ans[] = {countZero, countOne};

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 1, 0, 1};

        int[] ans = countZeroANDOne(arr);

        System.out.println("Count Zero: " + ans[0]);
        System.out.println("Count One: " + ans[1]);
    }
}
