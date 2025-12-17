import java.util.ArrayList;

import javax.sound.sampled.EnumControl.Type;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67);
        list.add(89);
        list.add(45);
        list.add(23);
        list.add(67);
        list.add(89);
        list.add(45);
        list.add(23);
        list.add(67);
        list.add(89);
        list.add(45);
        list.add(23);
        list.add(67);
        list.add(89);

        System.err.println(list);
    }
}