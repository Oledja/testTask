package main;

import java.util.ArrayList;
import java.util.List;

public class Unique {

    private static final String DELIMITER = ".";

    public String[] findAllCombinationWithDots(String str) {
        checkArguments(str);
        List<String> uniqueCombinations = findUniqueCombinations(str);
        uniqueCombinations.add(str);
        return uniqueCombinations.toArray(new String[uniqueCombinations.size()]);
    }

    private List<String> findUniqueCombinations(String str) {
        List<String> uniqStrings = new ArrayList<>();
        int index = 1;

        if (str.contains(DELIMITER)){
            index = str.lastIndexOf(DELIMITER)  + 2;
        }

        for (int i = index; i <= str.length() - 1; i++) {
            StringBuilder unique = new StringBuilder(str).insert(i, DELIMITER);
            uniqStrings.add(unique.toString());
            uniqStrings.addAll(findUniqueCombinations(unique.toString()));
        }
        return uniqStrings;
    }

    private void checkArguments(String str) {
        if (!str.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(String.format(
                    "Argument can only contain letters, arg = '%s'", str));
        }
    }

}
