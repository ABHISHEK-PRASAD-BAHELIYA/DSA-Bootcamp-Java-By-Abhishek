import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = in.nextLong();

        long res = 0;
        int ans = 0;
        while(n > 0) {
            long rem = n % 10;
            ans += rem;
            res = res * 10 + rem;
            n = n / 10;
        }
        System.out.println("Resverse number is : " + res);
        System.out.println("Total of this no: " + ans);

    }
}
