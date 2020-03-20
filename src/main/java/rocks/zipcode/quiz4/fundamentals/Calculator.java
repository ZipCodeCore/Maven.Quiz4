package rocks.zipcode.quiz4.fundamentals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return Math.pow(value, 2);
    }

    public static Double[] squareRoots(Double... values) {
        return Stream.of(values).map(Math::sqrt).collect(Collectors.toList()).toArray(new Double[0]);
    }

    public static Double[] squares(Double... values) {
        return Stream.of(values).map(v -> v * v).collect(Collectors.toList()).toArray(new Double[0]);
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }

    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
