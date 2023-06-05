package Practice;

import java.util.List;
import java.util.stream.Collectors;

public class SortNames {

    public static List<String> sortNames(List<String> names) {
        return names.stream().sorted().collect(Collectors.toList());
    }
}
