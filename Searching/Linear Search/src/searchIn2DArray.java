import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 22}
        };
        int target = 22;
        int[] ans = search(arr, target); //format of return value (row, col)
        System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }
    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col =0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int[] max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col =0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return new int[]{max};
    }
    static int[] min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element< min) {
                    min = element;
                }
            }
        }
        return new int[]{min};
    }
}
