package main;

import java.util.ArrayList;
import java.util.List;

public class Unique {

    public String[] findAllCombinationWithDots(String str) {
        checkArguments(str);
        List<String> strings = findUniqueCombinations(str);
        strings.add(str);
        return convertListToStringArray(strings);
    }

    private List<String> findUniqueCombinations(String str) {
        List<String> uniqStrings = new ArrayList<>();
        int index = 1;

        if (str.contains(".")){
            index = str.lastIndexOf(".")  + 2;
        }

        for (int i = index; i <= str.length() - 1; i++) {
            StringBuilder unique = new StringBuilder(str).insert(i, ".");
            uniqStrings.add(unique.toString());
            uniqStrings.addAll(findUniqueCombinations(unique.toString()));
        }
        return uniqStrings;
    }

    private String[] convertListToStringArray(List<String> strings) {
        String[] result = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            result[i] = strings.get(i);
            }
        return result;
    }

    private void checkArguments(String str) {
        if (!str.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(String.format(
                    "Argument can only contain letters, arg = '%s'", str));
        }
    }

}
