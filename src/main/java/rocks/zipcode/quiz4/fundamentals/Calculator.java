package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

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

        List<Double> ans = new ArrayList<>();

        for(Double d : value){
            ans.add(squareRoot(d));
        }
        return ans.toArray(new Double[0]);
    }

    public static Double[] squares(Double... values) {

        List<Double> ans = new ArrayList<>();

        for(Double d : values){
            ans.add(square(d));
        }
        return ans.toArray(new Double[0]);
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
