
public class SumPosNeg {

    public static int sumPosNeg(int[] arr) {

        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positiveSum += arr[i];
            } 
            else if (arr[i] < 0) {
                negativeSum += arr[i];
            }
        }
          int ans = positiveSum + negativeSum;
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -1, -2, -3};
        int ans = sumPosNeg(arr);
        System.out.println("positiveSum :" + ans);
            System.out.println("negativeSum :" + ans);
    }
}
