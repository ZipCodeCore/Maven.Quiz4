package rocks.zipcode.quiz4.fundamentals;



/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
      double root = Math.sqrt(value);
      return root;

    }

    public static Double square(Double value) {
        double square = value * value;
        return square;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] answer = new Double[value.length];
        for (int i = 0; i < value.length; i++) {
            answer[i] = squareRoot(value[i]);
        }
        return answer;
    }

    public static Double[] squares(Double... values) {
        Double[] answer = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            answer[i] = square(values[i]);
        }
        return answer;
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
