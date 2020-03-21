package rocks.zipcode.quiz4.fundamentals;

import static java.lang.Math.*;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return sqrt(value);
    }

    public static Double square(Double value) {
        return pow(value,2);
    }

    public static Double[] squareRoots(Double... value) {
        Double[] retVal = new Double[value.length];
        for(int i=0; i<value.length; i++)
        {
            retVal[i] = squareRoot(value[i]);
        }
        return retVal;
    }

    public static Double[] squares(Double... values) {
        Double[] retVal = new Double[values.length];
        for(int i=0; i<values.length; i++)
        {
            retVal[i] = square(values[i]);
        }
        return retVal;
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
