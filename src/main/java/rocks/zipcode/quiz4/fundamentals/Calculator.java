package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value*value;
    }

    public static Double[] squareRoots(Double... value) {
        List<Double> squareRootList = new ArrayList<>();
        Stream.of(value).forEach(num -> squareRootList.add(squareRoot(num)));

        return squareRootList.toArray(new Double[0]);
    }

    public static Double[] squares(Double... values) {
       List<Double> squareList = new ArrayList<>();
        Stream.of(values).forEach(value -> squareList.add(square(value)));

        return squareList.toArray(new Double[0]);
    }

    public static Double add(Double value1, Double value2) {
        return value1+value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1-value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }


}
