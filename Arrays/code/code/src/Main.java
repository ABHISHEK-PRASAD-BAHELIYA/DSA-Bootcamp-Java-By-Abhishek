//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Q: store a roll no.
        int a = 15;

        //Q: Store a person's name
        String name = "Abhishek singh";

        //Q: store 5 roll no.
        int rno1 = 23;
        int rno2 = 21;
        int rno3 = 90;

        //syntan
        //datatype[] variable_name = new datatype[size];
        //store 5 roll no.
//        int[] rnos = new int[5];
//        //or directly
//        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; //declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)

        System.out.println(ros[0]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        



    }
}