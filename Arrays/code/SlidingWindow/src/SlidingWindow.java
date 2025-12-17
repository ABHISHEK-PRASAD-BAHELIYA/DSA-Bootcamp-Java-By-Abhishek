public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {10, 6, 18, 12, 5, 17, 14, 13};
        int[] result = new int[3];

        //first 3 sum
        int sum1 = 0;
        for(int i = 0; i<3; i++) {
            sum1+= arr[i];
        }
        result[0] = sum1;

        int sum2 = 0;
        for(int i = 3; i<5; i++) {
            sum2+= arr[i];
        }
        result[1] = sum2;

        int num3 = 0;
        for(int i = arr.length - 3; i < arr.length; i++) {
            sum3 += arr[i];
        }
        result[2] = num3;

        System.out.println("final array : ");
        for(int val : result) {
            System.out.print(val + " ");
        }
    }
}