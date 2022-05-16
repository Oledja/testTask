package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Unique test = new Unique();
        String[] s = test.findAllCombinationWithDots("abcd");
        System.out.println(Arrays.toString(s));
    }
}
