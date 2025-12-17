import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Roll no.");
//        int rollno = sc.nextInt();
//        System.out.println("Your roll no is : " + rollno);

        String name = sc.next();
        System.out.println(name);

        float a = sc.nextFloat();
        System.out.println(a);
    }
}
