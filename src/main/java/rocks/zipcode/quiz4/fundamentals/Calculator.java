package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Double> temp = new ArrayList<Double>();
        for (Double number: value) {
            temp.add(Math.sqrt(number));
        }
        Double[] answer = temp.toArray(new Double[temp.size()]);
        return answer;
    }

    public static Double[] squares(Double... values) {
        ArrayList<Double> temp = new ArrayList<Double>();
        for (Double number: values) {
            temp.add(number*number);
        }
        Double[] answer = temp.toArray(new Double[temp.size()]);
        return answer;
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
