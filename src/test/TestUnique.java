package test;

import main.Unique;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestUnique {
    public static void main(String[] args) {
        Unique unique = new Unique();
        String testStr = "abcdefr";

        String[] result = unique.findAllCombinationWithDots(testStr);
        Set<String> setStr = new HashSet<>(Arrays.asList(result));

        System.out.println(result.length == setStr.size());
    }
}
