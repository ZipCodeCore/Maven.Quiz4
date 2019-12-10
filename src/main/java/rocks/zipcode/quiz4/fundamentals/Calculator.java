package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Double> squareRoots =  Arrays.stream(value).map(number -> Math.sqrt(number))
                .collect(Collectors.toList());
        return squareRoots.toArray(new Double[squareRoots.size()]);}

    public static Double[] squares(Double... values) {
        List<Double> squareRoots =  Arrays.stream(values).map(number -> number * number)
                .collect(Collectors.toList());
        return squareRoots.toArray(new Double[squareRoots.size()]);
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
