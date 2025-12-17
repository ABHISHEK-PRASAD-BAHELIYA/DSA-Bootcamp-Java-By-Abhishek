//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;
        System.out.println(MaxSum(arr, k));
    }
    static int MaxSum(int[] arr, int k) {
        int maxSum, windowSum = 0;
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        //slide the window
        for(int i = k; i<arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}