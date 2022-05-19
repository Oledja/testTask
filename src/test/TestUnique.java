package test;

import main.Unique;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestUnique {
    public static void main(String[] args) {
        Unique unique = new Unique();
        String testStr = "abcdefrgdh";

        String[] arrStr = unique.findAllCombinationWithDots(testStr);
        Set<String> setStr = new HashSet<>(Arrays.asList(arrStr));
        int allUniqResultsForLength = getCountUniqueResults(testStr);

        boolean result = Objects.equals(setStr.size(), allUniqResultsForLength);
        System.out.println(result);
    }

    private static int getCountUniqueResults(String str) {
        int strLength = str.length();
        if (strLength == 1) {
            return 1;
        }
        int result = 2;
        for (int i = 0; i < strLength - 2; i++) {
            result = result * 2;
        }
        return result;
    }
}
//