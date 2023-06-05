package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseString {
    public static List<String> getUppercaseString(String[] sourceStrings) {
       return Arrays.stream(sourceStrings)
               .filter(s -> s.startsWith("a") || s.startsWith("b"))
               .filter(s -> s.length() >= 3)
               .map(String::toUpperCase)
               .collect(Collectors.toList());
    }
}
