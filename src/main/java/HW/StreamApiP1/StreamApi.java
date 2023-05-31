package HW.StreamApiP1;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.NoSuchElementException;

public class StreamApi {
    /**
     * Given a List of Integer numbers,
     * return a sum of odd numbers or 0, if there are no odd numbers in the List.
     */

    public Integer getOddNumsSum(List<Integer> numbers) {
        int sum = numbers.stream().filter(s -> s % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        return sum;
    }

    /**
     * Given a List of Strings,
     * return a number of times the `element` String occurs in the List.
     */

    public Long calculateOccurrences(List<String> elements, String element) {
        long count = elements.stream().filter(s -> s.equals(element))
                .count();
        return count;
    }

    /**
     * Given a List of Strings, return the Optional of its first element.
     */

    public Optional<String> getFirstElement(List<String> elements) {
        Optional<String> any = elements.stream().filter(s -> elements.stream().anyMatch(s::startsWith))
                .findFirst();

        return any;
    }

    /**
     * Given an array of ints, return three smallest numbers as list in sorted manner.
     * For example for input {4, 1, 10, 20, 11, 3} output will be {1, 3, 4};
     */


    public List<Integer> getThreeSmallestNumbers(int[] numbers) {
        return Arrays.stream(numbers).sorted().limit(3).boxed().collect(Collectors.toList());
    }

    /**
     * Given a List of Strings,
     * find the String equal to the passed `element` or throw NoSuchElementException.
     */
    public String findElement(List<String> elements, String element) {
        String collect = elements.stream()
                .filter(e -> e.equals(element))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        return collect;
    }
}
