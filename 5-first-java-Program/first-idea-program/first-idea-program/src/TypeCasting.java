import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        float n = sc.nextInt();
//        int n = sc.nextFloat();
//        System.out.println(n);

        //type casting
        int num = (int)67.59f;
        System.out.println(num);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.print(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int Number = 'A';
//        System.out.println(Number);

//        System.out.println(3 * 3.142356f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
