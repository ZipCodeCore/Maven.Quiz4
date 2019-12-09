package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return null;
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        return null;
    }

    public static Double[] squares(Double... values) {

        int count = 0;
        for(int i = 0; i < values.length; i++){
            values[count] += values[i*i];
            count++;
        }

        return values;
    }

    public static Double add(Double value1, Double value2) {
        return null;
    }

    public static Double subtract(Double value1, Double value2) {
        return null;
    }


    public static Double divide(Double divisor, Double dividend) {
        return null;
    }
}
