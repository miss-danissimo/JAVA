package HW3.FirstTask.v1;

import java.util.Arrays;

class Main {

    public static void main(String[] args)
    {
        String[] words = {"One", "Five", "Three", "Four", "Two"};
        System.out.println(Arrays.asList(words));

        swap(words, 1, 4);
        System.out.println(Arrays.asList(words));
    }
    public static final <T> void swap(T[] array, int i, int j) {
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

}
