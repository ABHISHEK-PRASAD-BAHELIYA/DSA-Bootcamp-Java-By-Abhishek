import java.util.*;
public class Isprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int c = 2;

        if(num <= 1){
            System.out.println("Not Prime");
            return;
        }

        while(c < num) {
            if(num % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c = c + 1;
        }
        System.out.println("Prime");
    }
}