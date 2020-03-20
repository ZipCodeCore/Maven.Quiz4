package rocks.zipcode.quiz4.fundamentals;

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
        Double[] sqrt = new Double[value.length];
        Integer index = 0;
        for(int i = 0; i < value.length; i++){
            sqrt[index] = squareRoot(value[i]);
            index++;
        }
        return sqrt;
    }

    public static Double[] squares(Double... values) {
        Double[] sqr = new Double[values.length];
        Integer index = 0;
        for(int i = 0; i < values.length; i++){
            sqr[index] = square(values[i]);
            index++;
        }
        return sqr;
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
