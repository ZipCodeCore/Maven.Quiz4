package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return (Double) Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;

    }

    public static Double[] squareRoots(Double... value) {

        List<Double> al =new ArrayList(Arrays.asList(value));
        List<Double> newList = new ArrayList<>();
        for(Double x : al){
            newList.add(Math.sqrt(x));
        }
        Double[] result = new Double[newList.size()];
        newList.toArray(result);
        return result;

    }

    public static Double[] squares(Double... values) {
        List<Double> al =new ArrayList(Arrays.asList(values));
        List<Double> newList = new ArrayList<>();
        for(Double x : al){
            newList.add(x*x);
        }
        Double[] result = new Double[newList.size()];
        newList.toArray(result);
        return result;

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
