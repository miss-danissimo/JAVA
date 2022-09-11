package HW3.FirstTask.v2;

import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args)
    {
        String[] array = {"One", "Three", "Two", "Four", "Five"};
        System.out.println(Arrays.toString(array));

        swap(array, 1, 2);

    }

    static void swap(String[] array, int i, int i1) {
        Collections.swap(Arrays.asList(array), 1, 2);
        System.out.println(Arrays.toString(array));
    }

}