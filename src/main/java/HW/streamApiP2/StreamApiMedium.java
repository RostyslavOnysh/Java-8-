package HW.streamApiP2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiMedium {
    /**
     * Given list strings representing records of patients' visits to a Hospital
     * {"John Stevenson:2020", "Andrew Ferguson:2012", "Andrew Ferguson:2013"}.
     * Return number of unique persons who have visited hospital during the given year (second input param).
     * Be careful, because one person may visit a hospital several times per year and for each visit new record
     * will be generated. Result shouldn't contain duplicates.
     */
    public Long getVisitorsPerYear(List<String> records, int year) {
        long count = records.stream()
                .filter(rec -> rec.endsWith(":" + year))
                .map(rec -> rec.split(":")[0])
                .distinct()
                .count();
        return count;
    }

    /**
     * Given a map with the following view : "company name" - "monthly income delta"  (String/Integer)
     * Return list of the companies with positive delta. Their names should be sorted alphabetically
     * Example input : {"Sun.ltd" : 20_000}, {"Micro" : -5_200}, {"Clarity": 0}, {"Odyssey": 9_640};
     * Output : {"Odyssey", "Sun.ltd"}
     */
    public List<String> getCompanies(Map<String, Integer> input) {
        return input.entrySet().stream().filter(entry -> entry.getValue() > 0)
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of integer numbers, convert each integer into its' binary representation in string format
     * and join all of them into a single string and putting each value into brackets, it should look like this:
     * Input: {1, 20, 33}
     * Output:
     * (1)
     * (10100)
     * (100001)
     */
    public String convertAndModifyNumbers(List<Integer> numbers) {
        String collect = numbers.stream()
                .map(number -> String.format("(%s)", Integer.toBinaryString(number)))
                .collect(Collectors.joining("\n"));
        return collect;
    }

    /**
     * Given string value. Your task is
     * to increment char value of each symbol from the string. Amount to increment is
     * passed with the second input param - 'increment'
     */
    public String charsIncrementation(String string, int increment) {
        String string1 = string.chars()
                .map(c -> c + increment)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return string1;
    }

    /**
     * Given List of string where each element represents persons' age and name:
     * {"99:Johny", "20:Brad", ...} return the age of the oldest person
     */
    public Long getOldestPersonAge(List<String> people) {
        Optional<Integer> max = people.stream()
                .map(person -> Integer.parseInt(person.split(":")[0]))
                .max(Integer::compareTo);
        return max.map(Long::valueOf)
                .orElseThrow(NoSuchElementException::new);
    }
}
