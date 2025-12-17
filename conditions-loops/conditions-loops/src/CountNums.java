import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = in.nextLong();
        System.out.print("Enter which num want to count?: ");
        int num = in.nextInt();

        int count = 0;
        while(n > 0) {
            long rem = n % 10;
            if(rem == num) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(num + " is the " + count + " times in this number.");
    }
}
