package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        return Stream.of(values)
                .filter(x -> !x.equals(getMiddleElement(values)))
                .toArray(String[]::new);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        AtomicInteger i = new AtomicInteger(0);
        List<String> temp = new LinkedList<>();
        Arrays.stream(values)
                .forEach(x -> {
                    if(i.getAndIncrement() != values.length-1)
                        temp.add(x);
                });
        return temp.stream().toArray(String[]::new);
    }
}