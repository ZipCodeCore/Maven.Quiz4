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

        return value * value;
    }

    public static Double[] squareRoots(Double... value) {
        List<Double> newArray2 = new ArrayList<>();
        int count = 0;
        for(Double number : value){
            newArray2.add(squareRoot(number));
        }
        int len = newArray2.size();
        Double[] newArray = new Double[len];
        for(Double element : newArray2){
            newArray[count] = element;
            count++;
        }
        return newArray;
    }

    public static Double[] squares(Double... values) {
        List<Double> newArray2 = new ArrayList<>();
        int count = 0;
        for(Double number : values){
            newArray2.add(square(number));
        }
        int len = newArray2.size();
        Double[] newArray = new Double[len];
        for(Double element : newArray2){
            newArray[count] = element;
            count++;
        }
        return newArray;
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
