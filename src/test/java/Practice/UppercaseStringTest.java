package Practice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UppercaseStringTest {
    private static final String NEW_LIST_REGEX = ".*while.*|.*if.*|.*for.*|.*newHashSet.*|.*newArrayList.*|.*newLinkedList.*";
    private static String resultCode;
    private static final Map<String[], List<String>> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        resultCode = UppercaseString.class.getSimpleName();

        data.put(new String[]{}, List.of());
        data.put(new String[]{"a"}, List.of());
        data.put(new String[]{"b"}, List.of());
        data.put(new String[]{"api"}, List.of("API"));
        data.put(new String[]{"dba", "bbbb", "bcd"}, List.of("BBBB", "BCD"));
        data.put(new String[]{"Bacd", "Abcd"}, List.of());
        data.put(new String[]{"aaa", "bbb", "aaa", "bbb"}, List.of("AAA", "BBB", "AAA", "BBB"));
        data.put(new String[]{"a", "aa", "aaa", "b", "bb", "bbb"}, List.of("AAA", "BBB"));
        data.put(new String[]{"aAaAaA"}, List.of("AAAAAA"));
    }

    @Test
    public void getUppercaseString_forStringsInArray() {
        for (Map.Entry<String[], List<String>> entry : data.entrySet()) {
            String[] input = entry.getKey();
            List<String> expected = entry.getValue();
            List<String> actual = UppercaseString.getUppercaseString(input);
            Assert.assertEquals(String.format("The result should be %s for the input array %s\n",
                    expected, Arrays.toString(input)), expected, actual);
        }
    }

    @Test
    public void solution_containsHardcoding() {
        Assert.assertEquals("You should not create a List by yourself or use loops. Use Stream API methods.\n",
                false, resultCode.matches(NEW_LIST_REGEX));
    }
}
