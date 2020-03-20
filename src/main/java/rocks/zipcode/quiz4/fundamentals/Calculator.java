package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        for (Double i = 1.0; i < value ; i++) {
            if(square(i) == value) {
                return i;
            }
            else if (square(i) > value) {
                Double temp = i - 1;
                Double square = value/temp;
                square = (square + temp)/2;
                return square;
            }
        }
        return null;
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        value = Arrays.stream(value).map(x -> squareRoot(x)).toArray(Double[]::new);
        return value;
    }

    public static Double[] squares(Double... values) {
        values = Arrays.stream(values).map(x -> square(x)).toArray(Double[]::new);
        return values;
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
