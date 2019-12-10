package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        double temp;
        double sr = value / 2;

        do {
            temp = sr;
            sr = (temp + (value / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    //pass
    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {

        Double[] result = new Double[value.length];
        int count = 0;

        for (Double num : value){
            result[count] = squareRoot(num);
            count++;
        }
        return result;
    }

    //pass
    public static Double[] squares(Double... values) {

        Double[] result = new Double[values.length];
        int count = 0;

        for (Double value : values){
                result[count] = value * value;
                count++;
        }
        return result;
    }

    //pass
    public static Double add(Double value1, Double value2) {
        return value1 + value2;
    }
    //pass
    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }

    //pass
    public static Double divide(Double divisor, Double dividend) {
        return divisor / dividend;
    }
}
