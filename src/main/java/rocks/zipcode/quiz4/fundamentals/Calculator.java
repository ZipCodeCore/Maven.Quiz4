package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;

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

    public static Double[] squareRoots(Double... values) {
        Double[] squareRoots = new Double[values.length];
        for (int i = 0; i < squareRoots.length; i++) {
            Double value= values[i];
           squareRoots[i] = squareRoot(value);
        }
        return squareRoots;
    }

    public static Double[] squares(Double... values) {
        Double[] squares = new Double[values.length];
        for (int i = 0; i < squares.length; i++) {
            Double value= values[i];
            squares[i] = square(value);
        }
        return squares;
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
