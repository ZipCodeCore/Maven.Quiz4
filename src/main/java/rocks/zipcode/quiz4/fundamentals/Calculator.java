package rocks.zipcode.quiz4.fundamentals;

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
        Double[] doubles = new Double[value.length];
        for(int i =0 ; i<value.length; i++){
            doubles[i] = squareRoot(value[i]);
        }
        return doubles;
    }

    public static Double[] squares(Double... values) {
        Double[] doubles = new Double[values.length];
        for(int i =0 ; i<values.length; i++){
            doubles[i] = square(values[i]);
        }
        return doubles;
    }

    public static Double add(Double value1, Double value2) {
        return value1+value2;
    }
    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }
    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
