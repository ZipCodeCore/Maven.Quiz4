package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

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
        Stream<Double> stream1 = Arrays.stream(value);
        return stream1.map(Math::sqrt).toArray(size -> new Double[value.length]);
    }
    
    public static Double[] squares(Double... values) {
        Stream<Double> stream1 = Arrays.stream(values);
        return stream1.map(x -> x * x).toArray(size -> new Double[values.length]);
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
