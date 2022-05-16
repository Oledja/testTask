package main;

import java.util.ArrayList;
import java.util.List;

public class Unique {

    public String[] findAllCombinationWithDots(String string) {
        checkArguments(string);
        List<StringBuffer> stringBuffers = findUniqueCombinations(string);
        return convertListToStringArray(stringBuffers);
    }

    private List<StringBuffer> findUniqueCombinations(String str) {
        List<StringBuffer> uniqStrings = new ArrayList<>();
        int arg = 1;

        if (str.contains(".")){
            arg = str.lastIndexOf(".")  + 2;
        }

        for (int i = arg; i <= str.length() - 1; i++) {
            StringBuffer n = new StringBuffer(str).insert(i, ".");
            uniqStrings.add(n);
            uniqStrings.addAll(findUniqueCombinations(n.toString()));
        }
        return uniqStrings;
    }

    private String[] convertListToStringArray(List<StringBuffer> list) {
        String[] strings = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings[i] = list.get(i).toString();
            }
        return strings;
    }

    private void checkArguments(String arg) {
        if (!arg.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException(String.format(
                    "Argument can only contain letters, arg = '%s'", arg));
        }
    }

}
