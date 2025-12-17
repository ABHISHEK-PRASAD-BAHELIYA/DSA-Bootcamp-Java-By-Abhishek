import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 9;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        System.out.println(linearSearch3(arr, target));
    }

    //search the target and return true of false
    public static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        //run a for loop
        for(int index = 0; index < arr.length; index++) {
            //check for elements at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return true;
            }

        }

        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return false;
    }

    //search the target and return the element
    //search in  the array: return the index if item found
    //otherwise if item not found return -1
    public static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int index = 0; index < arr.length; index++) {
            //check for elements at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }

        }

        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}