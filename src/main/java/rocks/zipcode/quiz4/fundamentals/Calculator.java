package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
//        double x;
//
//        double squareRoot = value / 2;
//
//        do {
//            x = squareRoot;
//            squareRoot = (x + (value / x)) / 2;
//        } while ((x - squareRoot) != 0);
//
//        return squareRoot;

        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
//        Double[] newArr = new Double[value.length];
//
//        for (int i = 0; i < value.length; i++) {
//            newArr[i] += Math.sqrt(value[i]);
//        }
        return null;
    }

    public static Double[] squares(Double... values) {
//        Double[] newArr = new Double[values.length];
//
//        for (int i = 0; i < values.length; i++) {
//            newArr[i] += Math.pow(values[i],2);
//        }
        return null;
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
