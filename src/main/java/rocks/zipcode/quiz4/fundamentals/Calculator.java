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
        List<Double> myList= new ArrayList<>();
        for(Double d: value){
            myList.add(Math.sqrt(d));
        }
        Double[] returnArray= new Double[myList.size()];
        for(int i=0;i<returnArray.length;i++){
            returnArray[i]=myList.get(i);
        }
        return returnArray;
    }

    public static Double[] squares(Double... values) {
        List<Double> myList= new ArrayList<>();
        for(Double d: values){
            myList.add(d*d);
        }
        Double[] returnArray= new Double[myList.size()];
        for(int i=0;i<returnArray.length;i++){
            returnArray[i]=myList.get(i);
        }
        return returnArray;
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
