package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        Double t;
        Double sqt = value/2;
        do
        {
            t = sqt;
            sqt = (t + (value / t)) / 2;
        }
        while ((t - sqt) != 0);

        return sqt;
    }

    public static Double square(Double value) {

        return Math.pow(value,2);
    }

    public static Double[] squareRoots(Double... value) {

        List<Double> doubles = new ArrayList<>(Arrays.asList(value));
        Double[] result = new Double[value.length];
        int index =0;
        for(Double val : value){
            result[index] = Math.sqrt(val);
            index++;
        }

        return result;
    }

    public static Double[] squares(Double... values) {


        Double[] result = new Double[values.length];
        int index =0;
        for(Double val : values){
            result[index] = Double.valueOf(Math.pow(val, 2));
            index++;
        }

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
