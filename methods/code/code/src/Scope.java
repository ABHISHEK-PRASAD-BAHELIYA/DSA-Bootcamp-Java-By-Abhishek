public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        System.out.println(marks);
        {
            int a = 10;//already initialised outside the block in the same method, hence you cannot initialise again.
            int c = 99;
            //values initialized in this block, will remain in blocks
        }
//        System.out.println(c);// cannot use outside the block
    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
