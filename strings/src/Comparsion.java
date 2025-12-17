public class Comparsion {
    public static void main(String[] args) {
        String a = "Abhishek";
        String b = "Abhishek";
        String x = a;
        System.out.println(a == x);

        // ==
        System.out.println(a == b);

        String c = new String("Abhishek");
        String d = new String("Abhishek");

        System.out.println(c == d);
        System.out.println(c.equals(d)); //check value equal or not
        System.out.println(c.charAt(0));



    }
}
