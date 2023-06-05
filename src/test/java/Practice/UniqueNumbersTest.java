package Practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumbersTest {
    private static final String NEW_LIST_REGEX = ".*while.*|.*if.*|.*for.*|.*newHashSet.*|.*newArrayList.*|.*newLinkedList.*";
    private static String resultCode;
    private static final Map<String, List<Character>> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        resultCode = UniqueNumbers.class.getSimpleName();

        data.put("", List.of());
        data.put("1", List.of('1'));
        data.put("12", List.of('1', '2'));
        data.put("333", List.of('3'));
        data.put("4545", List.of('4', '5'));
        data.put("69696969696969696969", List.of('6', '9'));
        data.put("1122334", List.of('1', '2', '3', '4'));
        data.put("625", List.of('6', '2', '5'));
        data.put("678302657749201083", List.of('6', '7', '8', '3', '0', '2', '5', '4', '9', '1'));
    }

    @Test
    public void getUniqueCharacters_stringToList() {
        for (Map.Entry<String, List<Character>> entry : data.entrySet()) {
            String input = entry.getKey();
            List<Character> expected = entry.getValue();
            List<Character> actual = UniqueNumbers.getUniqueNumbers(input);
            Assert.assertEquals(String.format("The result should be %s for the input string \"%s\"\n",
                    expected, input), expected, actual);
        }
    }

    @Test
    public void solution_containsHardcoding() {
        Assert.assertEquals("You should not create a List by yourself or use loops. Use Stream API methods.\n",
                false, resultCode.matches(NEW_LIST_REGEX));
    }
}
