package rocks.zipcode.quiz4.fundamentals;

import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] result = (Double[]) Stream.of(value)
                .map(root -> {
                    double square = root * root;
                    return square;
                })
                .toArray();
        return result;
    }

    public static Double[] squares(Double... values) {
        Double[] result = new Double[values.length];
        Stream.of(result).forEach(Calculator::square);
            return result;
    }

    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
