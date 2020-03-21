package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
        List<Double> list = Arrays
                .stream(value)
                .map(Math::sqrt)
                .collect(Collectors.toCollection(ArrayList::new));
        Double[] result = new Double[list.size()];
         result = list.toArray(result);
         return result;
    }

    public static Double[] squares(Double... values) {
        List<Double> list = Arrays
                .stream(values)
                .map(d->d*d)
                .collect(Collectors.toCollection(ArrayList::new));
        Double[] result = new Double[list.size()];
        result = list.toArray(result);
        return result;
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
